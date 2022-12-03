package four.flow;

import java.util.Scanner;

/**
 * 1.switch-case-brake
 * 2.switch-case
 * 3.spojeni switch cases
 * -postavka zadatka:
 * program dopusta korisniku da unese redni broj dana u sedmici...
 * nakon unosa ispisuje korisniku ime dana na Njemackom.
 */

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("Unesite redni broj dana u sedmici");
        int redniBrojDana = new Scanner(System.in).nextInt();
        if (redniBrojDana<1 || redniBrojDana>7){
            System.out.println("Prvo naucite koliko sedmica ima dana pa onda Njemacki...");
        }
        else {
            switch (redniBrojDana){

            }
        }

    }
}
