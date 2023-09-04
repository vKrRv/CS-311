import java.util.Scanner; //Call the library

public class Task1 {
    public static void main(String[] args) {
        int N1, N2 , N3; //Declaring variables
        Scanner input = new Scanner(System.in); //Read user input using type "Scanner"
        System.out.print("Enter #1: ");
        N1 = input.nextInt(); //Catch input 1
        System.out.print("Enter #2: ");
        N2 = input.nextInt(); //Catch input 2
        System.out.print("Enter #3: ");
        N3 = input.nextInt(); //Catch input 3
        if (N1 > 0 && N2 > 0 && N3 > 0) { //If statement that make sure the user doesn't input negative numbers
            double avg = (N1 + N2 + N3) / 3.0; //Calculating average manually
            int max = Math.max(Math.max(N1, N2), N3); //Using "Math.max(int a, int b)" method to calculate maximum
            int min = Math.min(Math.min(N1, N2), N3); //Using "Math.min(int a, int b)" method to calculate minimum
            //Putting 3 values in one method isn't possible, the right way is "Math.max(Math.max(int a, int b), int c)
            System.out.println("The average is: " + avg); //Printing results
            System.out.println("Max value: " + max);
            System.out.println("Min value: " + min);
        }
        else{
            System.out.println("You can't enter negative numbers!\nTry again"); //Else case if there is negative numbers
        }
    }
}
