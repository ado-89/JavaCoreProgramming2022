package three;

public class UnaryDemo {

    public static void main(String[] args) {
        int number = +1;
        System.out.println(number);
        number = -number;
        System.out.println(number);

        //inkrement++ (post inkrement)
        number = 1;
        number++;
        System.out.println(number);
        //++inkrement (pre inkrement)
        number = 1;
        ++number;
        System.out.println(number);
        //RAZLIKA IZMEDJU POST I PRE INKREMENT
        number = 1;
        System.out.println(number++);
        System.out.println(number);
        number = 1;
        System.out.println(++number);
        System.out.println(number);
        //DEKREMENT -- (POST DEKREMENT)
        number = 1;
        number--;
        System.out.println(number);
        number = 1;
        System.out.println(number--); //1
        System.out.println(number); //0
        // PRE DEKREMENT
        number = 3;
        number--;
        System.out.println(number);
        number = 3;
        System.out.println(--number); //2
        System.out.println(number); //2
        //LOGICKI KOMPLEMENT OPERATOR
        boolean condition = false;
        System.out.println(!condition);








    }
}
