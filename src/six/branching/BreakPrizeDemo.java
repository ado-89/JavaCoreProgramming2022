package six.branching;

import java.util.Scanner;

public class BreakPrizeDemo {
    public static void main(String[] args) {
        int[] magicniBrojevi = {2341, 34221, 223111, 78278, 626, 888, 973, 33};
        double prize = 10000.0;
        double umanjeniIznos = prize * 0.1;
        BERIN:
        while (prize > 0) {
            System.out.println("Unesi broj i okusaj srecu");
            int uneseniBroj = new Scanner(System.in).nextInt();
            for (int magicniBroj : magicniBrojevi) {
                if (uneseniBroj == magicniBroj) {
                    System.out.println("Cestitamo! Osvojili ste nagradu od " +prize+ "$");
                    break BERIN;
                }
            }
            prize = prize - umanjeniIznos;
        }

    }
}
