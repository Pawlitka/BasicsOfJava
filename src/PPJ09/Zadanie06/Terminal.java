package PPJ09.Zadanie06;

public class Terminal {
    public int[] sortArr(int[] table) {
        int temporaryValue;

        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] > table[j]) {
                    temporaryValue = table[i];
                    table[i] = table[j];
                    table[j] = temporaryValue;
                }
            }
        }

        return table;
    }
}
