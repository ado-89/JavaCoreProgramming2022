package three;

import java.util.Scanner;

public class ComparisonDemo {

    //OPERATOR POREDJENJA

    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        boolean comparisonResult = number1 == number2;
        if (number1 == number2) {
            System.out.println("Uneli ste jednake brojeve");
        }
        if (number1 != number2) {
            System.out.println("Uneli ste razlicite brojeve");
        }
        if (number1 >= number2) {
            System.out.println("Prvi broj je veci ili isti sa drugim brojem");
        }
        if (number1 <= number2) {
            System.out.println("Uneli ste ili drugi broj manji od prvog ili iste brojeve");
        }
    }
}


