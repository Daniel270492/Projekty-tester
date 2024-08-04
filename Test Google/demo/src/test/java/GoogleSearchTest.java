import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Open Google homepage
        driver.get("https://www.google.com");

        // Find the search input element
        WebElement searchBox = driver.findElement(By.name("q"));
        assertNotNull("Search box was not found", searchBox);

        // Enter text into the search box
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search form
        searchBox.submit();

        // Wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

        // Verify if the search results page contains the expected text
        assertNotNull("Search results element was not found", searchResults);
        assertTrue("Text 'Selenium WebDriver' is not visible in search results",
                searchResults.getText().contains("Selenium WebDriver"));
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
