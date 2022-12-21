package five.loops;

import java.util.Scanner;

public class ExampleLoop {
    public static void main(String[] args) {
        while (true) {
            int inicijalnaVelicinaNiza = 1;
            int[] pogresniUnosi = new int[inicijalnaVelicinaNiza];
            System.out.println("Unesi peticu i zapocni igricu...");
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu mozes zapoceti igricu...");
                break;
            } else {

              if (pogresniUnosi.length == 0) {

              }
            }  System.out.println("Nisi unio peticu i ne mozes zapoceti igricu..");
        }
    }
}
