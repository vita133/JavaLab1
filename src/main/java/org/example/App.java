package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        try {
            System.out.println( FunctionCalculator.calculate(2.0, 3.0, 6, 6) );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
