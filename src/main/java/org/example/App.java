package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("2 - 3 = " + calculator.subtract(2, 3));
        System.out.println("2 / 3 = " + calculator.divide(2, 3));
        System.out.println("2 * 3 = " + calculator.multiply(2, 3));
    }
}
