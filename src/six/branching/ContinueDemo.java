package six.branching;

import java.util.Scanner;

/** postavka zadatka je recenica:
 * -zadatak: Pustiti korisnika aplikacije da unese slovo;
 * Nakon toga provjeriti dali je to slovo sadrzano u recenici;
 * Ukoliko jeste, ispisati koliko se puta to slovo ponavlja u recenici.
 */

public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = "Petar Pan je pojeo crvenu papriku.";
        char[] nizSlovaIzRecenice = recenica.toCharArray();
        System.out.println("Unesi tacno jedno slovo: ");
        char unesenoSlovo = new Scanner(System.in).nextLine().charAt(0);
        int brojacPogodjenogSlova = 0;

        for (char slovoIzNiza: nizSlovaIzRecenice) {
            if (unesenoSlovo != slovoIzNiza) {
                continue;
            }

            brojacPogodjenogSlova++;
        }
        System.out.println("Uneseno slovo " + unesenoSlovo + " se u recenici javlja " + brojacPogodjenogSlova + " puta");



    }
}
