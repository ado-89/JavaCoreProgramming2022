package four.flow;

import java.util.Scanner;

public class SwitchCaseBreakDemo {

    public static void main(String[] args) {

        System.out.println("Unesite redni broj dana u sedmici: ");
        int redniBrojDana = new Scanner(System.in).nextInt();

        String daniTekstualno = " ";

        switch (redniBrojDana) {
            case 1:
                daniTekstualno = "Montag, Dienstag, Mittwoch, Donnerstag, Freitag, Samstag, Sontag";
                break;
            case 2:
                daniTekstualno = "Dienstag, Mittwoch, Donnerstag, Freitag, Samstag, Sontag";
                break;
            case 3:
                daniTekstualno = "Mittwoch, Donnerstag, Freitag, Samstag, Sontag";
                break;
            case 4:
                daniTekstualno = "Donnerstag, Freitag, Samstag, Sontag";
                break;
            case 5:
                daniTekstualno = "Freitag, Samstag, Sontag";
                break;
            case 6:
                daniTekstualno = "Samstag, Sontag";
                break;
            case 7:
                daniTekstualno = "Sontag";
                break;
            case 8:
                daniTekstualno = "Neodgovarajuci broj dana u sedmici";
                break;

        }

        System.out.println(daniTekstualno);
    }


    }


