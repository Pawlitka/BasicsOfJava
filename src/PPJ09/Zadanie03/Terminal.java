package PPJ09.Zadanie03;

public class Terminal {
    public int findMax(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        }

        if(b > a && b > c) {
           return b;
        }

        return c;
    }
}
