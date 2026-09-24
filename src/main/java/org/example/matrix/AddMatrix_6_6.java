package org.example.matrix;

import java.util.Scanner;

public class AddMatrix_6_6 {
    public int[][] matrix_result;
    public void main(String[] args) {
        int col, row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        row = sc.nextInt();
        col = sc.nextInt();

        matrix_result = new int[row][col];

        System.out.println("Enter the elements of the matrix A: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix_result[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the matrix B: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix_result[i][j] += sc.nextInt();
            }
        }

        System.out.println("Resulting matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix_result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}