package Zadanie03;

public class Terminal {
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int x = screenWidth / side;
        int y = screenHeight / side;
        int numberOfSquares = x * y;

        int[][] tableOfSquares = new int[numberOfSquares][2];
        int index = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                tableOfSquares[index][0] = i;
                tableOfSquares[index][1] = j;
                index++;
            }
        }
        return tableOfSquares;
    }
}
