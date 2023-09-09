import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("First Name: ");
        String Fname = input.next();
        System.out.print("Middle Name: ");
        String Mname = input.next();
        System.out.print("Last Name: ");
        String Lname = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();
        String password = Fname.charAt(0) + Mname.charAt(Mname.length() / 2)
                + Lname.charAt(Lname.length() - 1) + age * 100 + "";
        //Never forget to include ( + "" ) in any string contain combination of variables
        System.out.println("Your password = " + password.toUpperCase());

    }
}
