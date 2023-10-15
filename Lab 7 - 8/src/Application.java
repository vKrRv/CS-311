import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int noStud = input.nextInt();
        Students[] studArray = new Students[noStud];
        int s;
        do {
            System.out.print("""
                    -------------------Students System-------------------
                    1. Add a new student
                    2. Update a student
                    3. Update the GPA of a student
                    4. Delete a student
                    0. Exit the system
                    Choose one:""");

            s = input.nextInt();

            switch(s){
                case 1:
                    newStud(studArray);
                    break;
                case 2:
                    System.out.println("Enter student's ID or last name: ");
                    String searchTerm = input.next();
                    search(searchTerm, studArray);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("-----------------------------------------------------");
                    break;
                default:
                    System.out.println("invalid value!");
            }
        }while(s != 0);
    }

    public static void newStud(Students[] studArray){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter (ID, First name, Last name, Birth date and GPA):");
        studArray[Students.studCounter] = new Students(in.next(), in.next(), in.next(), in.nextInt(), in.nextDouble());
    }
    public static void search(String term, Students[] arr){

    }
}


/*System.out.println("-------------------Students System-------------------\n" +
                           "Choose one..\n" +
                           "1. Add a new student\n" +
                           "2. Update a student\n" +
                           "3. Update the GPA of a student\n" +
                           "4. Delete a student\n" +
                           "0. Exit the system");*/