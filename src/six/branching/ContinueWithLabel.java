package six.branching;

import java.util.Scanner;

/** PARAMETRI ZADATKA:
 * 1.Recenicu ne unosi korisnik, vec je fiksno definirana u programu;
 * 2.Rijec unosi korisnik;
 * -Zadatak: -Program provjerava karakater po karakter dali se unesena rijec sadrzi u recenici;
 * --> Ideja je da se recenica i rijec konvertuju u niz karaktera i da se dalje radi sa nizovima...


public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica = "Uskoro cete dobiti zadatak da provjerite dali je unesena rijec palindrom";
        char[] nizSlovaRecenice = recenica.toCharArray();
        System.out.println("Unesite samo jednu rijec");
        String rijec = new Scanner(System.in).nextLine();
        char[] nizSlovaRijeci = rijec.toCharArray();
        boolean foundIt = false;
        LABELA: for (int i=0; i<nizSlovaRecenice.length; i++) {
            for (int j=0; j<nizSlovaRijeci.length; j++) {
                char slovoIzRijeci = nizSlovaRijeci(j);
                char slovoIzRecenice = nizSlovaRecenice(i+j);
                if (slovoIzRijeci != slovoIzRecenice) {
                    continue LABELA;
                }
            }
            foundIt = true;
            break;
        }
        String message;
        if (foundIt) {
            message = "Rijec koju ste unijeli je sadrzana u recenici!";
        }
        else {
            message = "Rijec koju ste unijeli NIJE sadrzana u recenici!";
        }
        System.out.println(message);


    }

    }

*/