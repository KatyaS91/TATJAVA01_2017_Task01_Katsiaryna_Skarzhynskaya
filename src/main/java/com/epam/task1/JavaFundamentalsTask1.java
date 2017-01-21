package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/18/17.
 */
public class JavaFundamentalsTask1 {


        public boolean result (String x) {
            char[] num = x.toCharArray();
            if ((num[0] + num[1]) == (num[2] + num[3])) {
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            JavaFundamentalsTask1 resultOfCalculation = new JavaFundamentalsTask1();
            System.out.print(resultOfCalculation.result("1221"));
        }
    }