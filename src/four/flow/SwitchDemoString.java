package four.flow;

import java.util.Scanner;

/**
 * SWITCH PRIMA KAO INPUT ONO STO SE NALAZI U MALIM ZAGRADAMA TIPA INT ILI ONO STO JE KONVERTABILNO U INTEGER
 * OD VERZIJE JAVA 7 U 'SWITCH MALE ZAGRADE' MOZE UCI I STRING VRIJEDNOST ILI STRING VARIJABLA!
 */

public class SwitchDemoString {
    public static void main(String[] args) {
        System.out.println("Unesite ime dana: ");
        String imeDanaNaNjemackom = new Scanner(System.in).nextLine();
        int redniBrojDana = switch (imeDanaNaNjemackom) {
            case "Montag" -> {yield 1;}
            case "Dienstag" ->{yield 2;}
            case "Mittwoch" ->{yield 3;}
            case "Donnerstag"->{yield 4;}
            case "Freitag" ->{yield 5;}
            case "Samstag" ->{yield 6;}
            case "Sontag" ->{yield 7;}
            default -> {yield -1;}

        };
        System.out.println(imeDanaNaNjemackom + " je po redu " + redniBrojDana + " dan u sedmici" );

    }
}
