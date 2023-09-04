import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("---------------Temperature Converter---------------");
        System.out.print("Enter temperature in Fahrenheit(F): "); //Ask for temperature in Fahrenheit
        Scanner input = new Scanner(System.in); //Read user input using type "Scanner"
        int F = input.nextInt(); //Catch input
        double C = (5/9.0) * (F - 32); //Adding the calculation for converting
        C = Math.round(C * 10)/10.0; //Rounding the result
        //make sure to divide by double adding decimal zero to avoid logical error
        System.out.println("Temperature in Celsius is: " + C); //Print the result
        System.out.println("---------------------------------------------------");

    }
}
