package org.example.height;

import java.util.Scanner;

public class DisplayTriangle_6_3 {
    public void main() {
        int height;
        System.out.println("Enter the height of the triangle");
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
