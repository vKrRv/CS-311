import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.print("Enter month's number (1 - 12): ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("It's January and it has 31 days");
                break;
            case 2:
                System.out.println("It's February and it has 28 days (29 days in leap year)");
                break;
            case 3:
                System.out.println("It's March and it has 31 days");
                break;
            case 4:
                System.out.println("It's April and it has 30 days");
                break;
            case 5:
                System.out.println("It's May and it has 31 days");
                break;
            case 6:
                System.out.println("It's June and it has 30 days");
                break;
            case 7:
                System.out.println("It's July and it has 31 days");
                break;
            case 8:
                System.out.println("It's August and it has 31 days");
                break;
            case 9:
                System.out.println("It's September and it has 30 days");
                break;
            case 10:
                System.out.println("It's October and it has 31 days");
                break;
            case 11:
                System.out.println("It's November and it has 30 days");
                break;
            case 12:
                System.out.println("It's December and it has 31 days");
                break;
            default:
                System.out.println("Non-valid value!");
                break;
        }
    }
}
