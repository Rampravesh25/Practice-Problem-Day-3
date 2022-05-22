package com.emp_wage_comp_prob;

public class UC2EmpDailyWage {
    public static void main(String[] args) {
        int empPrep = 1;
        int perHourWage = 20;
        int fullDayHours = 8;

        int empType = (int) (Math.random() * 100) % 2;
        if (empType == empPrep) {
            System.out.println((perHourWage * fullDayHours) + "Rs");
        } else {
            System.out.println("Emp is not Present");
        }
    }
}
