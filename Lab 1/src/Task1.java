import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter your birth year: "); //Ask for date of birth
        Scanner input = new Scanner(System.in); //Read input
        int DOB = input.nextInt(); //Catch input
        int CYear = 2023; //Current year
        int age = CYear - DOB; //Calculate age
        System.out.println("Your age is: " + age); //Print age
    }
}
