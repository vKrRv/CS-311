import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int N1, N2 , N3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter #1: ");
        N1 = input.nextInt();
        System.out.print("Enter #2: ");
        N2 = input.nextInt();
        System.out.print("Enter #3: ");
        N3 = input.nextInt();
        if (N1 > 0 && N2 > 0 && N3 > 0) {
            double avg = (N1 + N2 + N3) / 3.0;
            int max = Math.max(Math.max(N1, N2), N3);
            int min = Math.min(Math.min(N1, N2), N3);
            System.out.println("The average is: " + avg);
            System.out.println("Max value: " + max);
            System.out.println("Min value: " + min);
        }
        else{
            System.out.println("You can't enter negative numbers!\nTry again");
        }
    }
}
