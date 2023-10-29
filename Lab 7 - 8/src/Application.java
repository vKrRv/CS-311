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
                    5. Display
                    0. Exit the system
                    Choose one:""");

            s = input.nextInt();

            switch(s){
                case 1:
                    newStud(studArray);
                    break;
                case 2:
                    System.out.println("Search by id(1) Search by last name(2): ");
                    int c = input.nextInt();
                    if(c == 1){
                        System.out.println("Enter student's ID: ");
                        String searchTerm = input.next();
                        searchId(searchTerm, studArray);
                    }
                    else if(c == 2){
                        System.out.println("Enter student's ID: ");
                        String searchTerm = input.next();
                        searchName(searchTerm, studArray);
                    }
                    else{System.out.println("invalid input!"); break; }
                    break;
                case 3:
                    System.out.print("Enter student's index: ");
                    int j = input.nextInt();
                    System.out.print("Enter new term GPA: ");
                    double newGPA = input.nextDouble();
                    studArray[j].updateGPA(newGPA);
                    break;
                case 4:
                    System.out.println("Enter student's index: ");
                    int k = input.nextInt();
                    deleteStud(studArray, k);
                    break;
                case 5:
                    display(studArray);
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
    public static void searchId(String term, Students[] arr){
        for(int i = 0; i < Students.studCounter; i++){
            if(arr[i].id.equals(term)){
                updateInfo(arr, i);
            }
        }
    }
    public static void searchName(String term, Students[] arr){
        for(int i = 0; i < Students.studCounter; i++){
            if(arr[i].lastName.equals(term)){
                updateInfo(arr, i);
            }
        }
    }
    public static void updateInfo(Students[] arr, int i){
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to update?\n(1)ID\t(2)First Name\t(3)Last Name\t(4)Birth Date\t(5)GPA\t(0)Exit\n");
        int c = in.nextInt();
        switch (c){
            case 1:
                System.out.print("Enter the new ID: ");
                String id = in.next();
                arr[i].setId(id);
                break;
            case 2:
                System.out.print("Enter the new First Name: ");
                String fn = in.next();
                arr[i].setFirstName(fn);
                break;
            case 3:
                System.out.print("Enter the new Last Name: ");
                String ln = in.next();
                arr[i].setLastName(ln);
                break;
            case 4:
                System.out.print("Enter the new Birth Date: ");
                int bd = in.nextInt();
                arr[i].setBirthDate(bd);
                break;
            case 5:
                System.out.print("Enter the new GPA: ");
                double gpa = in.nextDouble();
                arr[i].setGPA(gpa);
                break;
        }
    }
    public static void deleteStud(Students[] arr, int k){
        for(int i = k; i < arr.length; i++){
            if((i + 1) == arr.length){
                Students.studCounter--;
            }else {
                arr[i] = arr[i + 1];
            }
        }
    }
    public static void display(Students[] arr){
        for(int i = 0; i < Students.studCounter; i++){
            System.out.println("Student{'" + arr[i].getId() + "', '" + arr[i].getName() +
                    "', '" + arr[i].getAge() + "', '" + arr[i].getGPA() + "'}");
        }
    }
}