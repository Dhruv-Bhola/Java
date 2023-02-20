package com.company;

public class MainN/*PascalConvention*/ {

    public static /* due to static we can run function without making class object*/ void main/*camelCaseConvention*/(String[] args) {
        // write your code here
        System.out.println("Hello World");
        int a = 10;
        int b = 10;
        int c = 10;
        int d = a + b + c;
        System.out.print("The sum is: ");
        System.out.println(d);

    }
}

