package five.loops;

import java.util.Scanner;

/** PARAMETRI ZADATKA:
 * 1.Recenicu ne unosi korisnik, vec je fiksno definirana u programu;
 * 2.Rijec unosi korisnik;
 * -Zadatak: -Program provjerava karakater po karakter dali se unesena rijec sadrzi u recenici;
 * --> Ideja je da se recenica i rijec konvertuju u niz karaktera i da se dalje radi sa nizovima...
 */

public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica = {"Uskoro cete dobiti zadatak da provjerite dali je unesena rijec palindrom"};
        char[] nizSlovaRecenice = recenica.toCharArray();
        System.out.println("Unesite samo jednu rijec");
        String rijec = new Scanner(System.in).nextLine();
        char nizSlovaRijeci = rijec.toCharArray();


    }
}
