package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */

public class JavaFundamentalsTask8 {
    int sum = 0;
    public int summary(int a) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % a) == 0) {
                sum = sum + numbers[i];
            }
        } return sum;
    }

    public static void main(String[] args) {
        JavaFundamentalsTask8 arrayItemsSummary = new JavaFundamentalsTask8();
        int result = arrayItemsSummary.summary(2);
        System.out.println(result);

    }
}