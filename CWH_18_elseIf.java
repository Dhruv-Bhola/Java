package com.company;
import java.util.Scanner;

public class CWH_18_elseIf {
    public static void main(String[] args) {

        String var = "gh";
        String var1 = "gh";

        switch (var){
            case "h":
                System.out.println("18");
                System.out.println("18");
                System.out.println("18");
                break;
            case "gh":
                System.out.println("23");
                break;
            case "h1":
                System.out.println("68");
                break;
            default:
                System.out.println("default");
        }

        switch (var1) {
            case "h" -> {
                System.out.println("18");
                System.out.println("18");
                System.out.println("18");
            }
            case "gh" -> System.out.println("23");
            case "h1" -> System.out.println("68");
            default -> System.out.println("default");
        }


        /*
        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced!");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
        if (age>2){
            System.out.println("You are not a baby!");
        }
         */
    }
}
