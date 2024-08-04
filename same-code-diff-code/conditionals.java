
// Java Conditional Statements
public class conditionals {
    public static void main(String[] args) {
        // deklaracja (int score) i inicjalizacja zmiennej ( = 85) zmiennej liczbowej
        int score = 55;
        
        // deklaracja if, potem w nawiasie podajemy warunek
        if (score > 90) 
        {
            // jeśli powyższy warunek jest spełniony wejdę do tego bloku kodu
            System.out.println("Grade A");
        } 
        // jeśli warunek w if nie jest spełniony, możemy dodać kolejny warunek przez elseif
        else if (score > 75) 
        {
            // jeśli powyższy warunek jest spełniony wejdę do tego bloku kodu
            System.out.println("Grade B");
        } 
        // jeśli żaden z warunków się nie powiedzie czyli nie uzyska logicznej prawdy, przechodzimy do else
        else 
        {
            // ten kod się wyświetli jeśli żaden inny blok nie zostanie uruchomiony
            System.out.println("Grade C or below");
        }



        // operatory logiczne
        // > - większe
        // < - mniejsze
        // == - logiczna równość
        // >= - większe równe
        // <= - mniejsze równe
        // != - sprzeczności

        // inicjalizacja i deklaracja zmiennej
        int wiek = 18;

        if(wiek >= 18){
            System.out.println("Możesz kupić alkohol");
        }
        else {
            System.out.println("Nie możesz kupić alkoholu");
        }

        String slowo = "nic";

        if(slowo.equals("nic")){
            System.out.println("jest ok");
        }
        else {
            System.out.println("nie jest");
        }
    }
}
