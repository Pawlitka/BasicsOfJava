package pl.pawel.kapusta.PPJ10.Zadanie02;

public class Terminal {
    public int[] method(int[] arr1, int[] arr2, int lengthDiff) {
        int sizeMinimum = Math.min(arr1.length, arr2.length);
        int[] answer = new int[sizeMinimum];
        int index = 0;

        if(lengthDiff < 0) {
            for(int i = 0; i < sizeMinimum; i++) {
                answer[i] = arr1[i] + arr2[i];
            }
            return answer;
        }

        if (lengthDiff > 0) {
            int[] answer2 = new int[lengthDiff];
            for(int i = arr2.length; i < arr1.length; i++) {
                answer2[index] = arr1[i];
                index++;
            }
            return answer2;
        }

        return null;


    }

}
