package pl.pawel.kapusta.PPJ10.Zadanie02;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[rand.nextInt(10) + 1];
        int[] arr2 = new int[rand.nextInt(10) + 1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(10) + 1;
            arr2[i] = rand.nextInt(10) + 1;
        }

        Terminal terminal = new Terminal();
        System.out.println(Arrays.toString(terminal.method(arr1, arr2, -2)));
    }
}
