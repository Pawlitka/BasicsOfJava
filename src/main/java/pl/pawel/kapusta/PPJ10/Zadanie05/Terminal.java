package pl.pawel.kapusta.PPJ10.Zadanie05;

public class Terminal {
    public static int maxNumberInArray = 0;
    public static int evenNumbersCounter = 0;

    public static int fiboR(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return fiboR(n - 1) + fiboR( n - 2);
    }

    public static int factR(int n) {
        if(n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return n * factR(n - 1);


    }

    public static int gdcR(int a, int b) {
        if(b == 0){
            return a;
        } else {
            return gdcR(b, a % b);
        }
    }

    public static int maxElem(int[] arr, int from) {
        if(from == arr.length) {
            return maxNumberInArray;
        }

        if(maxNumberInArray < arr[from]) {
            maxNumberInArray = arr[from];
        }

        return maxElem(arr, from + 1);
    }



    public static int numEven(int[] arr, int from) {
        if(from == arr.length) {
            return evenNumbersCounter;
        }
        if(arr[from] % 2 == 0) {
            evenNumbersCounter++;
        }

        return numEven(arr, from + 1);
    }

}
