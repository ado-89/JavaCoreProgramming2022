package four.flow;

import java.util.Scanner;

public class SwitchDemoNewJava {
    public static void main(String[] args) {
        System.out.println("Unesite godinu: ");
        int godina = new Scanner(System.in).nextInt();
        System.out.println("Unesite mjesec u godini: ");
        int mjesec = new Scanner(System.in).nextInt();
        int brojDanaMjeseca = 0;

        switch (mjesec) {
            case 1 -> brojDanaMjeseca = 31;
            case 3 -> brojDanaMjeseca = 31;
            case 5 -> brojDanaMjeseca = 31;
            case 7 -> brojDanaMjeseca = 31;
            case 8 -> brojDanaMjeseca = 31;
            case 10 -> brojDanaMjeseca = 31;
            case 12 -> brojDanaMjeseca = 31;
            case 4 -> brojDanaMjeseca = 30;
            case 6 -> brojDanaMjeseca = 30;
            case 9 -> brojDanaMjeseca = 30;
            case 11 -> brojDanaMjeseca = 30;
            case 2 -> {
                if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
                    brojDanaMjeseca = 29;
                } else {
                    brojDanaMjeseca = 28;
                }
            }
            default -> brojDanaMjeseca = -1;
        }
        System.out.println("Broj dana u mjesecu: " + brojDanaMjeseca);
    }
}
