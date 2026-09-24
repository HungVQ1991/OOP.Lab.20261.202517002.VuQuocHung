package org.example;

import org.example.custom.Pair;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SolveTwoVarSysEq_2_2_6 {

    private static Pair solveEquation(Pair first_eq, double first_res, Pair second_eq, double second_res) {
        double det_d = first_eq.getFirst() * second_eq.getSecond() - second_eq.getFirst() * first_eq.getSecond();
        double det_dx = first_res * second_eq.getSecond() - second_res * first_eq.getSecond();
        double det_dy = first_eq.getFirst() * second_res - second_eq.getFirst() * first_res;

        if (det_d == 0.0) {
            if (det_dx == 0.0 && det_dy == 0.0) {
                JOptionPane.showMessageDialog(null, "Infinite solution");
            } else {
                JOptionPane.showMessageDialog(null, "No solution");
            }
            return null;
        }

        double sol_x = det_dx / det_d;
        double sol_y = det_dy / det_d;
        return new Pair(sol_x, sol_y);
    }

    static void main() {
        Pair first_eq = new Pair();
        Pair second_eq = new Pair();
        double first_res;
        double second_res;

        try (Scanner sc = new Scanner(System.in)) {
            first_eq.setFirst(sc.nextDouble());
            first_eq.setSecond(sc.nextDouble());
            first_res = sc.nextDouble();

            second_eq.setFirst(sc.nextDouble());
            second_eq.setSecond(sc.nextDouble());
            second_res = sc.nextDouble();

            Pair solution = solveEquation(first_eq, first_res, second_eq, second_res);
            if (solution != null) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Root: x = " + solution.getFirst() + ", y = " + solution.getSecond()
                );
            }
        } catch (Exception ex) {
            System.out.print("Error: " + ex.getMessage());
        }
    }
}