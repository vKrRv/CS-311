import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("---------------Temperature Converter---------------");
        System.out.print("Enter temperature in Fahrenheit(F): ");
        Scanner input = new Scanner(System.in);
        int F = input.nextInt();
        double C = (5/9.0) * (F - 32);
        C = Math.round(C * 10)/10.0;
        System.out.println("Temperature in Celsius is: " + C);
        System.out.println("---------------------------------------------------");

    }
}
