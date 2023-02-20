package com.company;

import java.util.Scanner;
import java.util.Random;

public class EX_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 4)
        {
            Random a1 = new Random();
            int d = a1.nextInt(0, 4);
            System.out.println(d);

            System.out.println("Your Choice: ");
            String a = sc.next();
        /*
        d = 0 = paper
        d = 1 = rpck
        d = 0 = scissor
        */

            if (a.startsWith("rock")) {
                if (d == 0) {
                    System.out.println("Computer wins");
                } else if (d == 1) {
                    System.out.println("Tie");
                } else {
                    System.out.println("You win");
                }
            } else if (a.startsWith("paper")) {
                if (d == 0) {
                    System.out.println("Tie");
                } else if (d == 1) {
                    System.out.println("You win");
                } else {
                    System.out.println("Computer wins");
                }
            } else {
                if (d == 0) {
                    System.out.println("You win");
                } else if (d == 1) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("Tie");
                }
                i++;
            }
        }
    }
}
