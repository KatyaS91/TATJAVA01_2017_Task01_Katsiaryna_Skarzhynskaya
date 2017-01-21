package com.epam.task1;

/**
 * Created by skarzhynskaya_katya on 1/19/17.
 */
public class JavaFundamentalsTask3 {

    public double square (int a, int b){
        double result = (a + b)/2;
        return result;
    }
    public double hypotenuse (int a, int b){
        double result = Math.pow(a, 2) + Math.pow(b,2) * 2;
        return result;
    }
    public double perimeter (int a, int b, double c){
        double result = a + b + c;
        return result;
    }

    public static void main(String[] args){

        JavaFundamentalsTask3 squareResult = new JavaFundamentalsTask3();
        double totalSquare = squareResult.square(4, 3);
        System.out.println("Площадь прямоугольника = " + totalSquare);

        JavaFundamentalsTask3 hypotenuseResult = new JavaFundamentalsTask3();
        double totalHypotenuse = hypotenuseResult.hypotenuse(4,3);

        JavaFundamentalsTask3 perimeter = new JavaFundamentalsTask3();
        double totalPerimetr = perimeter.perimeter(4,5,totalHypotenuse);
        System.out.print("Периметр прямоугольника = " + totalPerimetr);


    }
}
