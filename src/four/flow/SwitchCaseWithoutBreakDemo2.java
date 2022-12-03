package four.flow;

import java.util.Scanner;

public class SwitchCaseWithoutBreakDemo2 {

    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici: ");
        int redniDani = new Scanner(System.in).nextInt();
        String daniTekstualno = " ";
        switch (redniDani) {
            case 1:
                daniTekstualno = "Montag, ";
            case 2:
                daniTekstualno = daniTekstualno + "Dienstag, ";
            case 3:
                daniTekstualno = daniTekstualno + "Mittwoch, ";
            case 4:
                daniTekstualno = daniTekstualno + "Donnerstag, ";
            case 5:
                daniTekstualno = daniTekstualno + "Freitag, ";
            case 6:
                daniTekstualno = daniTekstualno + "Samstag, ";
            case 7:
                daniTekstualno = daniTekstualno + "Sontag, ";
                break;
            default:
                daniTekstualno = "Neodgovarajuci broj dana u sedmici!";


        }

        System.out.println(daniTekstualno);
    }
}
