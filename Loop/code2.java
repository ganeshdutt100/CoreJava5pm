package Loop;

import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i = 20;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }


//        int j  = 7;
//        do{
//            System.out.println(j);
//            j++;
//        }
//        while(j <= 10);

        System.out.println("Enter your Starting Number : ");
        int i =  scanner.nextInt();
        System.out.println("Enter your Ending Number : ");
        int endingnumber = scanner.nextInt();
        while(i <= endingnumber) {
           if(i % 2 == 0) {
               System.out.println("Even : " + i);
           }
           else{
               System.out.println("Odd : " + i);

            }
            i++;
        }
//          int i = 1;
//        int table = 2;
//        while(i <= 10){
//            System.out.println(i * table);
//            i++;
//        }
    }
}
