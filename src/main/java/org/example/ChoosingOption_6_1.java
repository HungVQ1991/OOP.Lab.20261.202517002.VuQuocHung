package org.example;

import javax.swing.*;

public class ChoosingOption_6_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "DO you want yo change to first class ticket");
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
