package pl.pawel.kapusta.PPJ09.Zadanie06;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tebleUnsorted = new int[rand.nextInt(20) + 5];

        for (int i = 0; i < tebleUnsorted.length; i++) {
            tebleUnsorted[i] = rand.nextInt(20) + 1;
        }
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(tebleUnsorted));


        Terminal terminal = new Terminal();
        int[] newArr = terminal.sortArr(tebleUnsorted);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(newArr));
    }
}
