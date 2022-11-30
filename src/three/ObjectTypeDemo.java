package three;

public class ObjectTypeDemo {
    public static void main(String[] args) {
        int number = 455;
        number = 677;
        System.out.println(number);

        //NIZ
        int[] numbers = new int[2];
        numbers[0] = 455;
        numbers[1] = 677;
        System.out.println("Indeks 0 cuva vrijednost " + numbers[0]);

        //STRING
        String name = new String("Dejla");  // -> POZIV KONSTRUKTORA
        String name2 = "Dejla";  // -> STRING LITERAL
        String name3 = "Dejla";
        System.out.println(name2 == name); //false
        System.out.println(name2 == name3); //true
        System.out.println(name3 == name); //false
        System.out.println();
        System.out.println(name2.equals(name)); //true
        System.out.println(name2.equals(name3)); //true
        System.out.println(name3.equals(name)); //true




    }
}
