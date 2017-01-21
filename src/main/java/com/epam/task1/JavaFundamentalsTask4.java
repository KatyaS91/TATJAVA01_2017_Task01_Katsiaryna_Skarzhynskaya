package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class JavaFundamentalsTask4 {
    public boolean isBelong(int x, int y) {
        int x1 = -4;
        int x2 = 4;
        int y1 = 4;
        int y2 = -4;
        if (((x >= x1) && (x <= x2)) && ((y <= y1) && (y >= -4))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        JavaFundamentalsTask4 isBelong = new JavaFundamentalsTask4();
        boolean result = isBelong.isBelong(4,-4);
        System.out.println(result);

    }
}