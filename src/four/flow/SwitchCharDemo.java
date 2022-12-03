package four.flow;

public class SwitchCharDemo {
    public static void main(String[] args) {
        char ocjena = 'A';
        int ocjenaBrojevno;
        switch (ocjena) {
            case 'A':
                ocjenaBrojevno = 10;
                break;
            case 'B':
                ocjenaBrojevno = 8;
                break;
            default:
                ocjenaBrojevno = 6;
            break;


        }
        System.out.println("Ocjena je: " + ocjena);
    }
}
