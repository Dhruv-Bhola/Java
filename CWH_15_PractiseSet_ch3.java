package com.company;
import java.util.Scanner;

public class CWH_15_PractiseSet_ch3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "My name is Dhruv";
        System.out.println(s + "\n");

//        Q1
        s = s.toLowerCase();
        System.out.println(s);

//        Q2
        System.out.println(s.replace(" ", "_"));

//        Q3
        String l = "Dear <|name|>, Thanks a lot!";
        System.out.print("Enter your name: ");
        String m = sc.nextLine();
        System.out.println(l.replace("<|name|>", m));

//        Q4
        String d = "This string contains  double and   triple spaces";
        System.out.println(d);
        System.out.println(d.indexOf("  "));
        System.out.println(d.indexOf("   "));

//        Q5
        String q = "Dear Harry,\n\tThis JAVA COURSE is nice.\n\tThanks!";
        System.out.println(q);

    }
}
