package com.emp_wage_comp_prob;

public class UC1EmpAttendance {
    public static void main(String[] args) {
        int fullTime = 0;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == fullTime) {
            System.out.println("Emp is Present");
        } else {
            System.out.println("Emp is not Present");
        }
    }
}
