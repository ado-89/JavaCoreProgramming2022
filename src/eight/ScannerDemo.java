package eight;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner mojSkener = new Scanner(inputStream);
        int korisnickiUnos = mojSkener.nextInt();
        System.out.println(korisnickiUnos);
        PrintStream printStream = System.out;
        printStream.println(korisnickiUnos);
    }
}
