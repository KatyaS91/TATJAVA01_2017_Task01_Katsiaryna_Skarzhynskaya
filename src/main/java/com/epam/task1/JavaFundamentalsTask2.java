package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/18/17.
 */
public class JavaFundamentalsTask2 {

    public static void main(String[] args) {
        int b = 2;
        int a = 3;
        int c = 4;
        double result = (b + Math.sqrt(b*b + 4*a*c)/2*a) - Math.pow(a,3)*c + Math.pow(b, -2);
        System.out.println(result);
    }
}
