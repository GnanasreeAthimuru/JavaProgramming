package Oct.Ex_16102024;

import java.util.Scanner;

//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class Lab076 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");

        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        System.out.println(a>b?a:b);
    }
}
