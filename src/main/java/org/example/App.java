package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.subtract(2, 3));
        System.out.println(calculator.divide(2, 3));
        System.out.println(calculator.multiply(2, 3));
    }
}
