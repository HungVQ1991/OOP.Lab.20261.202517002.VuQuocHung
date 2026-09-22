package org.example;

import java.util.Scanner;

public class LinearEquation_2_2_6 {

    public static void solveLinearEquation(double coef_a, double coef_b) {
        if (coef_a == 0.0) {
            if (coef_b == 0.0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double sol_x = -coef_b / coef_a;
            System.out.println("Unique solution: x = " + sol_x);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            double coef_a = sc.nextDouble();

            System.out.print("Enter b: ");
            double coef_b = sc.nextDouble();

            solveLinearEquation(coef_a, coef_b);
        } catch (Exception ex) {
            System.out.println("Invalid input.");
        }
    }
}