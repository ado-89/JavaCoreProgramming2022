package five.array;

import java.util.Scanner;

public class ArrayBasicExampleDemo {

    public static void main(String[] args) {
        int[] brojevi = new int[3];
        System.out.println("Unesi broj 1:");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj 2:");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj 3:");
        brojevi[2] = new Scanner(System.in).nextInt();

       for (int number: brojevi) {
           System.out.println(number);
       }
    }
}
