package Oct.Ex_16102024;
//Take a user input - Name, Age and Salary and print them in the end.
import java.util.Scanner;
public class Lab077 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String Name = sc.next();
        System.out.println("Enter Age");
        int Age=sc.nextInt();
        System.out.println("Enter Salary");
        double Salary = sc.nextDouble();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Salary);


    }

}
