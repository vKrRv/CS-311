import java.util.Scanner; //Calling the library

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter your birth year: "); //Ask for date of birth
        Scanner input = new Scanner(System.in); //Read user input using type "Scanner"
        int DOB = input.nextInt(); //Catch input
        // using .nextInt() for integer, ".nextDouble() for double and .nextLine for string and so on.."
        int CYear = 2023; //Current year
        int age = CYear - DOB; //Calculate age
        System.out.println("Your age is: " + age); //Print age
    }
}
