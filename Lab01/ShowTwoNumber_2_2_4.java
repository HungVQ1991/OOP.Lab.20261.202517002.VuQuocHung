package org.example;
import javax.swing.JOptionPane;

public class ShowTwoNumber_2_2_4 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = JOptionPane.showInputDialog(null, "Enter the first number: ", JOptionPane.INFORMATION_MESSAGE);
        str2 = JOptionPane.showInputDialog(null, "Enter the second number: ", JOptionPane.INFORMATION_MESSAGE);
        String str_notification;
        str_notification = str1 + " And " + str2;
        JOptionPane.showMessageDialog(null, "Show two numbers: ", str_notification, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}