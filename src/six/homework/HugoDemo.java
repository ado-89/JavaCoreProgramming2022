package six.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HugoDemo {
    public static void main(String[] args) {
        int velicinaNiza = 0;
        int[] pogresniUnosi = new int[velicinaNiza];

        System.out.println("Unesi peticu i zapocni igricu");
        while (true) {
            int number = new Scanner(System.in).nextInt();
            if (number == 5) {
                System.out.println("Unio si peticu i zapoceo si igricu");
                break;
            } else{

                velicinaNiza++;
                pogresniUnosi = Arrays.copyOfRange(pogresniUnosi, 0, velicinaNiza);
                pogresniUnosi[velicinaNiza-1] = number;
                String porukaKorisniku = "Unio si ";
                for (int pogresanUnos : pogresniUnosi) {
                    porukaKorisniku = porukaKorisniku + pogresanUnos + "";
                }

                porukaKorisniku = porukaKorisniku + ", a petice nigdje";
                System.out.println(porukaKorisniku);
            }

        }
    }
}
