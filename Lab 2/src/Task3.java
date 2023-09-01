import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String s1 = input.next();
        int len1 = s1.length();
        System.out.print("Enter 2nd string: ");
        String s2 = input.next();
        int len2 = s2.length();
        System.out.print("Enter 3rd string: ");
        String s3 = input.next();
        int len3 = s3.length();
        int max = Math.max(Math.max(len1, len2), len3);
        if(max == len1){
            System.out.println("The longest string between the three is: " + s1);
        }
        else if(max == len2){
            System.out.println("The longest string between the three is: " + s2);
        }
        else{
            System.out.println("The longest string between the three is: " + s3);
        }
    }
}
