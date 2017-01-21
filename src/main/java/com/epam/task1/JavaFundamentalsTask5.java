package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class JavaFundamentalsTask5 {

    double multiplication(int a){
        if (a < 0){
            return Math.pow(a, 2);
        } else {
            return Math.pow(a, 4);
        }
    }
    public static void main(String[] args){
        JavaFundamentalsTask5 multiplicationResult = new JavaFundamentalsTask5();
        double result = multiplicationResult.multiplication(0);
        System.out.println(result);

    }
}
