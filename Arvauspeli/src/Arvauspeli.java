import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        // Nimi, joka käyttäjän tulee arvata
        String oikeaNimi = "Matti";
        
        // Käytetään Scanneria
        Scanner scanner = new Scanner(System.in);
        
        // Toistetaan kysymystä, kunnes arvaus on oikea
        while (true) {
            System.out.print("Arvaa nimi: ");
            String arvaus = scanner.nextLine();
            
            // Tarkistetaan, onko arvaus oikea
            if (arvaus.equalsIgnoreCase(oikeaNimi)) {
                System.out.println("Arvasit oikein!");
                break; // Lopetetaan looppi, jos arvaus on oikea
            } else {
                System.out.println("Väärin! Yritä uudestaan.");
            }
        }
        
        // Suljetaan scanneri
        scanner.close();
    }
}
