package PPJ10.Zadanie03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int screenWidth = 15;
        int screenHeight = 10;
        int side = 2;

        int[][] result = Terminal.calculateSquares(screenWidth, screenHeight, side);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
