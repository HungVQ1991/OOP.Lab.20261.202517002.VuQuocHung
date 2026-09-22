package org.example.calendar;

import java.util.Scanner;

public class DisplayDayInMonth_6_4 {
    public String[] month_name = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public String[] abb1 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String[] abb2 = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (Full name, abbreviation or number): ");
        String month_input = sc.nextLine().trim();

        int month = -1;
        boolean is_numeric_month = true;

        if (month_input.isEmpty()) {
            is_numeric_month = false;
        } else {
            for (int i = 0; i < month_input.length(); i++) {
                if (!Character.isDigit(month_input.charAt(i))) {
                    is_numeric_month = false;
                    break;
                }
            }
        }

        if (is_numeric_month) {
            int parsed_month = Integer.parseInt(month_input);
            if (parsed_month >= 1 && parsed_month <= 12) {
                month = parsed_month;
            }
        } else {
            for (int i = 0; i < 12; i++) {
                if (month_input.equalsIgnoreCase(month_name[i]) ||
                        month_input.equalsIgnoreCase(abb1[i]) ||
                        month_input.equalsIgnoreCase(abb2[i])) {
                    month = i + 1;
                    break;
                }
            }
        }

        if (month == -1) {
            System.out.println("Invalid month input.");
            sc.close();
            return;
        }

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year.");
        }

        int days;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                boolean is_leap_year = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                days = is_leap_year ? 29 : 28;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println("Days in month " + month + " of year " + year + ": " + days);
        sc.close();
    }
}