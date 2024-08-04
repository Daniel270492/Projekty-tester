import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.SimpleWebServer;

public class SDATest {

    @Before
    public void startServer() throws Exception{
        SimpleWebServer.main(null);
    }

    @After
    public void stopServer(){
        
    }

@Test
public void testHelloWorldResponse() throws IOException, InterruptedException {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("http://localhost:8000/"))
        .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    assertEquals(200, response.statusCode());
    assertEquals("Hello World!", response.body());
}

}