package com.company;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
//        break and continue using loops
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }

//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is Great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//break is used to exit the loop weather the condition is true or false
//        System.out.println("Loop ends here");



//        ************************
//              CONTINUE
//        ************************
//        for (int i=0; i<5; i++){
//            if (i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
////            control: konsi line execute ho rhi hai
////            continue : jab continue hai tab keval usi continue tak execute karo, uske aage nxt iteration par jao
//            System.out.println(i);
//            System.out.println("Java is great");
//        }


//        BREAK AND CONTINUE CAN OPERATE FROM INSIDE THE LOOP
        int i=0;
        do{
            i++;
            if (i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }while(i<5);

        System.out.println("Loop ends here");

    }
}
