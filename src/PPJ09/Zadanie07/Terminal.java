package PPJ09.Zadanie07;

import java.util.Arrays;

public class Terminal {
    public static void splitToDigits(int number) {
        if (number > 0) {
            int counter = 0;
            int temp = number;

            while (temp != 0) {
                temp = temp / 10;
                counter++;
            }

            int[] result = new int[counter];

            for (int i = counter - 1; i >= 0; i--) {
                result[i] = number % 10;
                number /= 10;
            }
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Please provide positive integer");
        }

    }
}
