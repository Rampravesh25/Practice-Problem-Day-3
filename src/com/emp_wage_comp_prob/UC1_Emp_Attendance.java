package com.emp_wage_comp_prob;

public class UC1_Emp_Attendance {
    public static void main(String[] args) {
        final int full_time = 0;
        int emp_type = (int) (Math.random() * 100) % 2;
        if (emp_type == full_time) {
            System.out.println("Emp is Present");
        } else {
            System.out.println("Emp is not Present");
        }
    }
}
