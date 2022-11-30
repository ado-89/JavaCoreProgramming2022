package three;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj:");
        int number2 = new Scanner(System.in).nextInt();

        //Adittion +
        int result = number1 + number2;
        System.out.println("Rezultat sabiranja je " + result);

        result = number1 - number2;
        System.out.println("Rezultat oduzimanja je " + result);

        result = number1 * number2;
        System.out.println("Rezultat mnozenja je " + result);

        result = number1 / number2;
        System.out.println("Rezultat dijeljenja je " + result);

        result = number1 % number2;
        System.out.println("Rezultat operatora modulo je " + result);

    }
}