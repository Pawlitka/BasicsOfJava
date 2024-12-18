package pl.pawel.kapusta.PPJ10.Zadanie01;

public class Terminal {
    public static int[] tableOfDiffLengths(int[][] table) {
        int[] diffLengths = {0,0};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(table[i][j] % 2 != 0) {
                    diffLengths[1]++;
                } else {
                    diffLengths[0]++;
                }
            }
        }


        return diffLengths;
    }
}
