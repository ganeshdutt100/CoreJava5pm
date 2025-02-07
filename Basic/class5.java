package Basic;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 80;
//        if(a >= 70 && a<=80){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }


//        int studetnsMarks = 41;
//
//         if(studetnsMarks >= 60){
//             System.out.println("Grade: A");
//         }
//         else if(studetnsMarks >= 50){
//             System.out.println("Grade: B");
//         }else if(studetnsMarks >= 40){
//             System.out.println("Grade: C");
//         }
//         else{
//             System.out.println("Grade: F");
//         }
//        if(con){
////            stm
//        }


        System.out.println("Enter your weekdays: ");
        int weekday  = sc.nextInt();

        if(weekday == 1){
            System.out.println("Monday");
        }
        else if(weekday == 2){
            System.out.println("Tuesday");
        }
        else if(weekday == 3){
            System.out.println("Wednesday");
        }
        else if(weekday == 4){
            System.out.println("Thursday");
        }
        else if(weekday == 5){
            System.out.println("Friday");
        }
        else if(weekday == 6){
            System.out.println("Saturday");
        }
        else if(weekday == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid weekday");
        }
    }
}
