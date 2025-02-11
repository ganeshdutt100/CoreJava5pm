package DecisionMakingStatement;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scrNAme = new Scanner(System.in);
//        int a = 10;
//        String str = "hello world ";
//
//        if(str == "hello world "){
//            System.out.println(true);
//        }

//        int marks = 20;
//
//        if(marks >= 50){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }

        System.out.println("Enter your WeekDays: ");
        int WeekDays = scrNAme.nextInt();
        if(WeekDays == 1){
            System.out.println("Monday");
        }
        else if(WeekDays == 2){
            System.out.println("Tuesday");
        }
        else if(WeekDays == 3){
            System.out.println("Wednesday");
        }
        else if(WeekDays == 4){
            System.out.println("Thursday");
        }
        else if(WeekDays == 5){
            System.out.println("Friday");
        }
        else if(WeekDays == 6){
            System.out.println("Saturday");
        }
        else if(WeekDays == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid Day");
        }
    }
}
