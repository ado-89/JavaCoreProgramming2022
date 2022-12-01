package four;

import javax.swing.JOptionPane;
import java.util.Scanner;


/**
 * Pustiti korisnika da u konzoli unese broj godima
 * Program provjerava punoljetnost korisnika konzumirajuci broj unetih godina.
 */

public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite vas broj godina: ");
        int starostKorisnikaPrograma = new Scanner(System.in).nextInt();
        boolean uslovZaPunoljetnost = starostKorisnikaPrograma >= 18;
        if (uslovZaPunoljetnost) {

            JOptionPane.showMessageDialog(null, "Vi ste punoljetni");
        } else {
            JOptionPane.showMessageDialog(null, "Niste punoljetni");


        }
    }
}
