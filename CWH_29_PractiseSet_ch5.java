package com.company;

public class CWH_29_PractiseSet_ch5 {
    public static void main(String[] args) {
        /*
//        Q1

        float[] Array = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f};
        float sum = 0;

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
            sum = sum + Array[i];
        }
        System.out.println("The Sum is: " + sum);

        for (float v : Array) {
            System.out.println(v);
            sum += v;
        }
        System.out.println("The Sum is: " + sum);

//        Q2

        int[] a = {1, 2, 3, 4, 5};
        int n = 3;
        boolean isInArray = false;

//        for (int i=0; i<a.length; i++){
//            if (n==a[i]){
//                isInArray = true;
//                break;
//            }
//        }

        for (int h : a){
            if (n==h){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }

//        Q3

        float[] marks = {95.0f, 95.0f, 95.0f, 95.0f, 95.0f};
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        float average = sum / marks.length;
        System.out.println("The Average is: " + average);

//        Q4

        int[][] r  = {{0,1,2},
                      {3,4,5}};
        int[][] r1 = {{0,1,2},
                      {3,4,5}};
        int[][] result = {{0,0,0},
                      {0,0,0}};

//        int[][] r = new int[2][3];
//        int[][] r1 = new int[2][3];
//        int[][] r2 = new int[2][3];
//
//        r[0][0] = 0;
//        r[0][1] = 1;
//        r[0][2] = 2;
//        r[1][0] = 3;
//        r[1][1] = 4;
//        r[1][2] = 5;

        System.out.println("r: ");
        for(int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
                System.out.print(r[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

//        r1[0][0] = 0;
//        r1[0][1] = 1;
//        r1[0][2] = 2;
//        r1[1][0] = 3;
//        r1[1][1] = 4;
//        r1[1][2] = 5;
        System.out.println("r1: ");
        for(int i=0; i<r1.length; i++){
            for (int j=0; j<r1[i].length; j++){
                System.out.print(r1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("result:");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
//                System.out.printf("i: %d\n j: %d\n", i, j);
                result[i][j] = r[i][j] + r1[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

//        r2[0][0] = r[0][0] + r1[0][0];
//        r2[0][1] = r[0][1] + r1[0][1];
//        r2[0][2] = r[0][2] + r1[0][2];
//        r2[1][0] = r[1][0] + r1[1][0];
//        r2[1][1] = r[1][1] + r1[1][1];
//        r2[1][2] = r[1][2] + r1[1][2];
//        System.out.println("r2 = r + r1 : ");
//        for(int i=0; i<r2.length; i++){
//            for (int j=0; j<r2[i].length; j++){
//                System.out.print(r2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        System.out.println();

//        Q5

        int[] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i=0; i<n; i++){
            // Swap arr[i] and arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }

//        Q6

        int[] arr = {-1,2,3,4,5,-6667};
//        int max = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);

//        Q7

        int[] arr = {1,2,3,4,5,6667};
        int min = 999999;
        int min = Integer.MAX_VALUE;
        for (int e: arr){
            if (e<min){
                min = e;
            }
        }
        System.out.println("Min: "+min);
         */

//        Q8

        boolean isSorted = true;
        int[] arr = {1,2,3,4,676775,6667};
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }



//        boolean isSorted = false;
//        int[] arr = {17878787,2,3,4,676775,6667};
//        for (int i=0; i<arr.length-1; i++) {
//            if (arr[i] < arr[i + 1]) {
//                isSorted = true;
//                break;
//            }
//        }
//
//        if (isSorted){
//            System.out.println("Sorted");
//        }
//        else {
//            System.out.println("Not Sorted");
//        }


    }
}
