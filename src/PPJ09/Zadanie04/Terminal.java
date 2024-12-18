package PPJ09.Zadanie04;

public class Terminal {
    public boolean isEqual(int[][] tab1, int[][] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }

        for(int i = 0; i < tab1.length; i++) {
            if(tab1[i].length != tab2[i].length) {
                return false;
            }
        }

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                if (tab1[i][j] != tab2[i][j]) {
                     return false;
                }
            }
        }

        return true;
    }
}
