package three;

//  (&& - USLOVNI AND OPERATOR)
//  (|| - USLOVNI OR OPERATOR)

import java.util.Scanner;

public class ConditionalDemo1 {
    public static void main(String[] args) {
        System.out.println("Unesi svoju starost: ");
        int starost = new Scanner(System.in).nextInt();
        System.out.println("Unesi prosjek ocjena: ");
        double prosjekOcjena = new Scanner(System.in).nextDouble();
        if (starost >= 18 && prosjekOcjena >= 3.5) {
            System.out.println("Ispunili ste uslove za upis na fakultet");
        }
        if (starost>=18 || prosjekOcjena >= 3.2) {

            System.out.println("Mozete se vjencati");
        }

    }
}
