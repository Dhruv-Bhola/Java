package com.company;

public class CWH_17_logical {
    public static void main(String[] args) {
        boolean a = true;
//        boolean a = false;
//        boolean b = true;
        boolean b = false;

        System.out.println("For Logical AND...");
//        for and gate . hota hai
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");
//        for or gate + hota hai
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical NOT...");
        System.out.print("NOT(a): ");
        System.out.println(!a);

        System.out.print("NOT(b): ");
        System.out.println(!b);
    }
}
