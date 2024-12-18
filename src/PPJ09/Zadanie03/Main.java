package PPJ09.Zadanie03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Terminal terminal = new Terminal();
        int foundMaxNumber = terminal.findMax(a,b,c);

        System.out.println(foundMaxNumber);
    }

}
