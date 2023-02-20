package com.company;
import java.util.Scanner;

public class CWH_19_ch4_practiseSet {
    public static void main(String[] args) {

//        Q 1
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

//        Q 2
//        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of 1st Subject: ");
//        m1 = sc.nextByte();
//        System.out.println("Enter marks of 2nd Subject: ");
//        m2 = sc.nextByte();
//        System.out.println("Enter marks of 3rd Subject: ");
//        m3 = sc.nextByte();
//
////        if (m1>33){
////            System.out.println("You are pass in m1");
////        }
////        else{
////            System.out.println("You are fail in m1");
////        }
////
////        if (m2>33){
////            System.out.println("You are pass in m2");
////        }
////        else{
////            System.out.println("You are fail in m2");
////        }
////
////        if (m3>33){
////            System.out.println("You are pass in m3");
////        }
////        else{
////            System.out.println("You are fail in m3");
////        }
//
//
////        float p = (m1 + m2 + m3 / 300) * 100;
//        float p = (m1 + m2 + m3)/3.0f;
//        System.out.println("Overall Percentage: " + p);
//
//        if (p>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("You are pass");
//        }
//        else {
//            System.out.println("You are fail");
//        }

//        Q 3

//        System.out.println("Enter your annual income in lakhs: ");
//        float inc = sc.nextFloat();
//        float tax = 0;
//        if (inc <= 2.5){
//            tax = tax + 0;
//        }
//        else if (inc>2.5 && inc<=5.0) {
//            tax = (inc - 2.5f)*0.05f;
//        }
//        else if (inc>5.0 && inc<=10.0) {
//            tax = (5.0f - 2.5f)*0.05f;
////            5.0f to 2.5f
//            tax = tax + (inc - 5.0f)*0.20f;
//        }
//        else {
//            tax = (5.0f - 2.5f)*0.05f;
//            tax = tax + (10.0f - 5.0f)*0.20f;
//            tax = tax + (inc - 10.0f)*0.30f;
//        }
//
//        System.out.println("Tax paid: " + tax);

//        Q 4
//        System.out.println("Enter your no.: ");
//        byte no = sc.nextByte();
//
//        switch (no){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Q 5
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//
//        if ( ((year / 100) % 4 == 0) && (year % 4 == 0) )
//        {
//            System.out.println("The year is leap year!");
//        }
//
//        else
//        {
//            System.out.println("The year is not a leap year!");
//        }

//        Q 6
        System.out.println("Enter a Website: ");
        String w = sc.next();

        if (w.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(w.endsWith(".org")){
            System.out.println("Organisation Website");
        }
        else if(w.endsWith(".in")){
            System.out.println("Indian Website");
        }

    }
}
