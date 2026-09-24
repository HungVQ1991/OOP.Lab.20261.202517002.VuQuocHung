package org.example.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperateArray_6_5 {
    public void main() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.print("Sorted array: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Sum of array: " + sum);
        double avg = (double) sum / list.size();
        System.out.println("Average of array: " + avg);
    }
}
