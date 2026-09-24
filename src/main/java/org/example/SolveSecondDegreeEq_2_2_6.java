package org.example;

import java.util.Scanner;

public class SolveSecondDegreeEq_2_2_6 {
    public void Solve(double a, double b, double c) {
        double result = 0;
        double det = b * b - 4 * a * c;
        if (a == 0) {
            System.out.print("Error: First degree is zero");
        }
        if (det < 0) {
            System.out.println("No real solution");
        }
        else if (det == 0) {
            System.out.print("Solution: " + (-b / (2 * a)));
        }
        else {
            System.out.print("First root: " + ((-b +  Math.sqrt(det)) / (2 * a)));
            System.out.print("Second root: " + ((-b - Math.sqrt(det)) / (2 * a)));
        }

    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        SolveSecondDegreeEq_2_2_6 obj = new SolveSecondDegreeEq_2_2_6();
        obj.Solve(a, b, c);
        sc.close();
    }
}
