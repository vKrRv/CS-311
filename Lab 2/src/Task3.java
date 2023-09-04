import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Read user input using type "Scanner"
        System.out.print("Enter 1st string: ");
        String s1 = input.next(); //Catch input 1, we can use ".next()" for string
        int len1 = s1.length(); //Calculate length of string using ".length()"
        System.out.print("Enter 2nd string: ");
        String s2 = input.next(); //Catch input 2
        int len2 = s2.length();
        System.out.print("Enter 3rd string: ");
        String s3 = input.next(); //Catch input 3
        int len3 = s3.length();
        int max = Math.max(Math.max(len1, len2), len3); //Calculating max
        if(max == len1){ //Nested if statement to identify max and print its value
            System.out.println("The longest string between the three is: " + s1);
        }
        else if(max == len2){
            System.out.println("The longest string between the three is: " + s2);
        }
        else{ //No need to add "else if" because it's the only case left
            System.out.println("The longest string between the three is: " + s3);
        }
    }
}
