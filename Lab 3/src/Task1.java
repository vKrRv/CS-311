import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt(); //Express number of student as "size" to use in for loop
        int max = 0;
        String maxStudent = " ";
        for(int i = 1; i <= size; i++){
            System.out.print("Enter name and score of student" + i + ": ");
            String student = input.next(); //Didn't set as ".nextLine()" so it doesn't include the score
            int score = input.nextInt();
            if(score > max){
                max = score;
                maxStudent = student;
            }
        }
        System.out.println("the student with the highest score is " + maxStudent);
        System.out.println("The highest score is " + max);

    }
}
