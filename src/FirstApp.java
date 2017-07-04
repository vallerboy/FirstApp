/**
 * Created by Lenovo on 03.07.2017.
 * Że jestem fajny
 */
// tutaj też jestem fajny

public class FirstApp {



    public static void main(String[] args){
        System.out.println("Hello World");
        int myAge = 10;
        myAge = 15;
        double myCash = 2500.50f;
      //  myCash = 3000f;

        // / - dzielenie
        // * - mnożenie
        // + - dodawania
        // - - odejmowania
        // % - modulo dzielenie
        // ^ - potegowanie

         String welcomeText = "Hello in my world!";
         //final welcomeText = "Hello!"; - slowko kluczowe final powoduje brak mozliwosci ponownej inicjalizacji

        int ageIrek = 30;
        ageIrek += 10; // = ageIrek = ageIrek + 10;
        ageIrek *= 5; // = ageIrek = ageIrek * 5;
        System.out.println(ageIrek);


        ageIrek = ageIrek + 1;
        ageIrek += 1;
        ageIrek++;

        // Dekrementacja
        ageIrek = ageIrek - 1;
        ageIrek -= 1;
        ageIrek--;

        String ageText = "Oskar" + " ma " + myAge + " lat";
        StringBuilder stringBuilder = new StringBuilder("").append("Oskar").append(" ma ").append(myAge).append( "lat");


        int ageInt = 150;
        String age = String.valueOf(ageInt);

        System.out.println(age);

    }
    //psvm
}
