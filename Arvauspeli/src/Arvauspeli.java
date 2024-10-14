import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        // Nimi, joka käyttäjän tulee arvata
        String oikeaNimi = "Matti";
        
        // Käytetään Scanneria
        Scanner scanner = new Scanner(System.in);
        
        int arvausKerrat = 0; // Muuttuja arvausten laskemiseen
        
        // Toistetaan kysymystä, kunnes arvaus on oikea tai käyttäjä kirjoittaa "loppu"
        while (true) {
            System.out.print("Arvaa nimi (tai kirjoita 'loppu' lopettaaksesi): ");
            String arvaus = scanner.nextLine();
            arvausKerrat++; // Lisätään arvausyritysten määrää
            
            // Tarkistetaan, haluaako käyttäjä lopettaa pelin
            if (arvaus.equalsIgnoreCase("loppu")) {
                System.out.println("Peli loppui. Arvauksia tehtiin yhteensä: " + arvausKerrat);
                break;
            }
            
            // Tarkistetaan, onko arvaus oikea
            if (arvaus.equalsIgnoreCase(oikeaNimi)) {
                System.out.println("Onneksi olkoon! Arvasit oikein " + arvausKerrat + ". yrittämällä!");
                break; // Lopetetaan looppi, jos arvaus on oikea
            } else {
                System.out.println("Väärin! Yritä uudestaan.");
            }
        }
        
        // Suljetaan scanner
        scanner.close();
    }
}
