package Loop;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your table Number: ");
        int table = scanner.nextInt();
     for(int i= 1; i <= 10; i++){
//          2 * 1 = 2
         System.out.println( table + " *  "+  i + " =  "+  i * table);
     }
    }
}
