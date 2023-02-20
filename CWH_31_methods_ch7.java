package com.company;

public class CWH_31_methods_ch7 {
    /*static*/static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=6, b=6;
        int c=logic(a,b);
//        Method Invocation using Object Creation
//        CWH_31_methods_ch7 obj = new CWH_31_methods_ch7();
//        int c=obj.logic(a, b);
        int a1=1, b1=2;
        int c1=logic(a1,b1);
//        int c1=obj.logic(a1, b1);
        int a2=2, b2=1;
        int c2=logic(a2,b2);
//        int c2=obj.logic(a2, b2);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
    }
}
