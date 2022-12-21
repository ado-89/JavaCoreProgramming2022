package five.array;

/**
 * Prvi slozeni tip podatka
 * NIZ!
 */

public class ArrayConstructionDemo {
    public static void main(String[] args) {
        int number;
        number = 23;
        number = 34;
        number = 45;
        System.out.println(number);

        /** NIZ ce nam sacuvati sve ove brojeve iznad
         * 1.Deklaracija niza (tip i ime)
         */
        int[] numbers;

        /** 1. Nacin kreiranja
         * 2. Alokacija ili zauzimanje memorijskog prostora
         * 3. Dodjela tom mem.prostoru vrijednosti;
         */
        numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 45;
        for (int n: numbers) {
        System.out.println(n + ",");
        }



    }
}
