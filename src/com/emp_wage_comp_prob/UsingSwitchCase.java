package com.emp_wage_comp_prob;

public class UsingSwitchCase {
    public static void main(String[] args) {
        int fullTime = 1;
        int partTime = 2;
        int perHourWage = 20;
        int fullDayHours = 12;
        int halfDayHours = 8;
        switch (partTime = 2) {
            case 1:
                System.out.println(perHourWage * fullDayHours + "Rs");
                break;
            case 2:
                System.out.println(perHourWage * halfDayHours + "Rs");
                break;
            case 3:
                System.out.println("Emp is Absent");
                break;
        }

    }
}
