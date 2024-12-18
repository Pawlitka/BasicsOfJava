package PPJ09.Zadanie04;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] tab1 = new int[rand.nextInt(2) + 1][rand.nextInt(2) + 1];
        int[][] tab2 = new int[rand.nextInt(2) + 1][rand.nextInt(2) + 1];

        filler(tab1);
        filler(tab2);
        System.out.println(Arrays.deepToString(tab1));
        System.out.println(Arrays.deepToString(tab2));

        Terminal terminal = new Terminal();

        System.out.println(terminal.isEqual(tab1, tab2));
    }

    private static void filler(int[][] tab) {
        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(10);
            }
        }
    }
}
