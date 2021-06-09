package com.codegym;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    public Student(int roll, String name) {
        this.rollNo = roll;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
