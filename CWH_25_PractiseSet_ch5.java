package com.company;

public class CWH_25_PractiseSet_ch5 {
    public static void main(String[] args) {
//        Q1
//        int n=5;
//        for (int i=n; i>=1; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//         Q2
//        int n=3;
//        int i=1;
//        int j=1;
//        int count=0;
//        int sum=0;
//        while(i<n){
//            while(j<n){
//                if (i%2==0){
//                    count++;
//                }
//                j++;
//            }
//            if (count==2){
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.println(sum);

//        int n=4;
//        int sum=0;
//        int i=0;
//        while (i < n) {
//            sum=sum+(2*i);
//            i++;
//        }
//        System.out.println(sum);

//        Q3

//        int n=5;
//        for (int i=1; i<=10; i++){
////            System.out.println(n*i);
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
////            i++;
//        }

//        Q4

//        int n=10;
//        for (int i=10; i>=1; i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//        Q5

//        int n=5;
//        int fact=1;
//        for (int i=1; i<=n; i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);

//        Q6

//        int n=5;
//        int fact=1;
//        int i=1;
//        while(i<=n){
////            fact=fact*i;
//            fact *= i;
//            i++;
//        }
//        System.out.println(n+"! is: "+fact);

//        Q7

//        int n=5;
//        int i=n;
//        while(i>=1){
//            int j=0;
//            while(j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }

//        Q9

//        int n=8;
//        int sum=0;
//        for (int i=0; i<=10; i++){
////            sum=sum+(n*i);
//            sum += n*i;
//        }
//        System.out.println(sum);

//        Q11

        int n=4;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+(2*i);
        }
        System.out.println(sum);
    }
}
