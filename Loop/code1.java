package Loop;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your table Number: ");
//        int table = scanner.nextInt();
//     for(int i= 1; i <= 10; i++){
////          2 * 1 = 2
//         System.out.println( table + " *  "+  i + " =  "+  i * table);
//     }


//        even odd
//     for(int i= 1; i <= 20; i++){
//         if(i % 2 == 0){
//             System.out.println(i + " is even");
//         }else {
//             System.out.println(i + " is odd");
//         }



//            starting and ending number from user
        System.out.println("Enter your stating Number  : ");
       int startNumber = scanner.nextInt();
        System.out.println("Enter your Ending Number : ");
         int endNumber  = scanner.nextInt();
         for(int i=startNumber; i <= endNumber; i++){
         if(i % 2 == 0){
             System.out.println(i + " is even");
         }else {
             System.out.println(i + " is odd");
         }


     }


//        int number  = scanner.nextInt();
//        if(number % 2 == 0){
//            System.out.println("Even ");
//        }
//        else {
//            System.out.println("Odd");
//        }
    }
}
