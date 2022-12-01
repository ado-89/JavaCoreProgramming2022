package four;

import java.util.Scanner;

/**
 * Profesor treba da se fokusira na analizu vaseg ispita i broja vasih bodova
 * Program treba da na osnovu broja vasih bodova profi izgenerise adekvatnu ocjenu
 */

public class IfElseDemo {

    public static void main(String[] args) {
        System.out.println("Unesite broj bodova ostvarenih na ispitu: ");
        int brojBodova = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojBodova >= 90) {
            ocjena = 'A';
        } else if (brojBodova >= 80) {
            ocjena = 'B';
        } else if (brojBodova >= 70) {
            ocjena = 'C';
        } else if (brojBodova >= 60) {
            ocjena = 'D';
        }
        else {
            ocjena = 'F';
        }
        System.out.println("Ocjena " + ocjena);


    }

}
