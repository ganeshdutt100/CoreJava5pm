package Basic;

import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your First Number :");
        int a = scanner.nextInt();
        System.out.println("Enter your second number ");
        int b  = scanner.nextInt();

        int c = a+b;
        System.out.println("Sum " + a +  " + " + b + " = " + c);
    }
}
