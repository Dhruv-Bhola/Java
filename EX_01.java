package com.company;
import java.util.Scanner;

public class EX_01 {
    public static void main(String[] args) {
        float a, b, c, d, e, percent, total_marks;
        System.out.println("Enter total marks");
        Scanner q = new Scanner(System.in);
        total_marks = q.nextFloat();
        System.out.println("Enter marks");
        a = q.nextInt();
        b = q.nextFloat();
        c = q.nextFloat();
        d = q.nextFloat();
        e = q.nextFloat();

        percent = ((a+b+c+d+e)/total_marks)*100;
        System.out.println("Percentage: " + percent);

    }
}
