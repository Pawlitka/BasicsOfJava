package pl.pawel.kapusta.PPJ10.Zadanie04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9}};

        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(Terminal.trans(a)));
    }
}
