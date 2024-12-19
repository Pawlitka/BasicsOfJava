package pl.pawel.kapusta.PPJ10.Zadanie05;

public class Terminal {
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

}
