package com.bridgelabz;

public class UC3EmpPartTimeWage {
    public static void main(String[] args) {
        int partTime = 1;
        int fullTime = 0;
        int perHoursWage = 20;

        int empType = (int) (Math.random() * 100) % 2;

        if (empType == partTime) {
            System.out.println(partTime * perHoursWage + "Rs");
        } else {
            System.out.println("Not Calculated");
        }
        if (empType == 12) {
            System.out.println(fullTime * perHoursWage + "Rs");
        } else {
            System.out.println("Not Calculated");
        }

    }
}
