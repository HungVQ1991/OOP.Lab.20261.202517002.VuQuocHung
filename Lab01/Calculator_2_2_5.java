package org.example;
import java.util.Scanner;

public class Calculator_2_2_5 {
    public static void main(String args[]) {
        double first, second, result = 0;
        char operation;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first = input.nextDouble();
        System.out.print("Enter second number: ");
        second = input.nextDouble();
        System.out.println("Enter the operator: ");
        operation = input.next().charAt(0);
        switch (operation) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case  '/':
                result = first / second;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println("The result of " + first + operation + second + " is " + result);
        input.close();
        System.exit(0);
    }
}
