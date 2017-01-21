package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class JavaFundamentalsTask6 {
    double maxValue (double a, double b, double c){
        if ((a>b) &&(a>c)){
            return a;
        } if ((b>a) && (b>c)){
            return b;
        } else  {
            return c;
        }
    }
    double minValue (double a, double b, double c){
        if((a<b)&&(a<c)){
            return a;
        } if ((b<a)&&(b<c)){
            return b;
        } else  {
            return c;
        }
    }

    public static void main(String[] args){
        JavaFundamentalsTask6 summary = new JavaFundamentalsTask6();
        double max = summary.maxValue(2,3,-4);
        double min = summary.minValue(2,3,-4);
        double result = max + min;
        System.out.println(result);

    }
}
