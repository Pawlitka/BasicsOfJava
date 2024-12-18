package PPJ09.Zadanie05;

public class Terminal {
    public void charCounter(char[] table) {
        int[] asciiCounter = new int[255];

        for (int i = 0; i < table.length; i++) {
            int index = table[i];
            asciiCounter[index]++;
        }

        for (int i = 0; i < asciiCounter.length; i++) {
            if (asciiCounter[i] > 0) {
                char character = (char) i;
                System.out.println(character + " -> " + asciiCounter[i]);
            }
        }
    }
}