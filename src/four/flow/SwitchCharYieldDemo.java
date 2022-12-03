package four.flow;

public class SwitchCharYieldDemo {
    public static void main(String[] args) {
        char ocjena = 'A';
        int ocjenaBrojevno = switch (ocjena) {
            case 'A' ->
            {yield 10;}

            case 'B' ->
            {yield 9;}

            default -> {
                yield 6;
            }
        };
        System.out.println("Ocjena je: " + ocjenaBrojevno);


    }
}
