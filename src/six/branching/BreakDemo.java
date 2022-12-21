package six.branching;

import java.util.Scanner;

public class BreakDemo {


    public static void main(String[] args) {
        int[] magicniBrojevi = {347, 566, 77345, 1462, 895543, 43321, 7766554, 51};
        while (true) {
            System.out.println("Unesite broj i okusajte srecu: ");
            int uneseniBroj = new Scanner(System.in).nextInt();
            boolean pogodio = false;
            for (int i=0; i<magicniBrojevi.length; i++)  {
                if (uneseniBroj==magicniBrojevi[i]) {
                    System.out.println("Fakat si sretan i aferim");
                    pogodio = true;
                    break;
                }
            }
            if (pogodio) {
                break;
            }
        }
    }
}
