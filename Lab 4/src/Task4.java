import java.util.Scanner;

enum Machine{ON, OFF,START, IN_PROGRESS, DONE}

public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("----------------Machine----------------" +
                         "\nChoose (ON, OFF, START, IN_PROGRESS, DONE): ");
        String choice = input.next().toUpperCase();
        check(Machine.valueOf(choice));
        System.out.print("---------------------------------------");
    }

    public static void check(Machine c){
        switch(c){
            case ON:
                System.out.println("The machine is ON!");
                break;
            case OFF:
                System.out.println("The machine is OFF, GOOD BYE");
                break;
            case START:
                System.out.println("The machine is starting..");
            case IN_PROGRESS:
                System.out.println("..In progress..");
            case DONE:
                System.out.println("Done!!");
                break;
           }
    }
}

