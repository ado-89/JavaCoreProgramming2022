package four.flow;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        System.out.println("Unesite redni broj dana u sedmici");
        int redniBrojDana = new Scanner(System.in).nextInt();

        switch (redniBrojDana){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Postovani, prvo naucite koliko jedna sedmica ima dana.");
                break;
        }
    }
}
