package com.codegym;

public class Main {

    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1, "Hoang");
        Student student2 = new Student(2, "Khanh");
        Student student3 = new Student(3, "Nam");
        student1.display();
        student2.display();
        student3.display();
    }
}
