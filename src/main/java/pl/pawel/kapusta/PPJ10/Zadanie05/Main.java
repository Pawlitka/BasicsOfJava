package pl.pawel.kapusta.PPJ10.Zadanie05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(Terminal.fiboR(45));

        System.out.println(Terminal.factR(12));

        System.out.println(Terminal.gdcR(12125, 40643));

        int[] a = {3,8,2,9,7,4};
        System.out.println("Max : " + Terminal.maxElem(a,0));
        System.out.println("Num even : " + Terminal.numEven(a,0));
    }
}
