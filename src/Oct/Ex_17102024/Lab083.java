package Oct.Ex_17102024;
import java.util.Scanner;
public class Lab083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age.");
        int age = sc.nextInt();

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.
        if(age > 18){
            System.out.println("Allowed to vote!");
        }
        else {
            System.out.println("Not Allowed!");
        }
    }
}