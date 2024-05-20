// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author My name
 *
 */
public class Calculator {	
//CHECKSTYLE:OFF
	/**
     * The main method to start the application.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
//CHECKSTYLE:ON
		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.Operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}
    /**
     * Performs a mathematical operation on two operands.
     *
     * @param first the first operand
     * @param second the second operand
     * @param operator the operator indicating the operation to be performed ('1' for addition, '2' for subtraction, '3' for multiplication, '4' for division)
     * @return the result of the operation as a String, or an error message if the operator is not correct
     */
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
