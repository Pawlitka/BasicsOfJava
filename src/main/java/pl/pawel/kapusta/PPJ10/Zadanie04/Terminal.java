package pl.pawel.kapusta.PPJ10.Zadanie04;



public class Terminal {
    public static int[][] trans(int[][] table) {
        int [][] result = new int[table[0].length][table.length];
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                result[j][i] = table[i][j];
            }
        }
        return result;
    }
}
