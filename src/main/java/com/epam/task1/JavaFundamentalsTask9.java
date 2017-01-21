package com.epam.task1;

import java.util.ArrayList;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class JavaFundamentalsTask9 {
    public static void main(String[] args){

        ArrayList<Integer> longerMassive = new ArrayList<Integer>();
        longerMassive.add(1);
        longerMassive.add(2);
        longerMassive.add(3);
        longerMassive.add(4);
        longerMassive.add(5);

        ArrayList<Integer> shorterMassive = new ArrayList<Integer>();
        shorterMassive.add(0);
        shorterMassive.add(0);
        shorterMassive.add(0);

        int numberElement = 2;

        longerMassive.addAll(numberElement, shorterMassive);
        System.out.print(longerMassive);


    }
}

