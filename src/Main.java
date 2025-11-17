public class Main {

    // Lekcija 2: Promjenljive (variables) i tipovi podataka u Javi
    public static void main(String[] args) {

        // 1. Tekst (String)
        String country = "Austria";
        String city = "Wels";

        // 2. Cijeli brojevi (int, long)
        int population = 62000;      // broj stanovnika
        long worldPopulation = 8000000000L; // globalna populacija

        // 3. Realni brojevi (double, float)
        double temperature = 18.5;   // trenutna temperatura u °C

        // 4. Logicka vrijednost (boolean)
        boolean isStudent = true;
        boolean hasJob = false;

        // Ispis na ekranu
        System.out.println("DRZAVA: " + country);
        System.out.println("GRAD: " + city);
        System.out.println("Broj stanovnika: " + population);
        System.out.println("Temperatura: " + temperature + " °C");
        System.out.println("Da li sam student? " + isStudent);
        System.out.println("Da li trenutno radim? " + hasJob);
        System.out.println("Svjetska populacija: " + worldPopulation);
    }
}