import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine(); //Using ".nextLine()" cuz it might be a sentence not only 1 word
        int size = str.length(); //U can skip this step and directly use "str.length()" in the for loop
        int c = 0; //A counter to adjust number of letters M needed to delete
        String newStr = ""; //Generating new modified string is an easier way to solve this problem
        for(int i = 0; i < size; i++){
            String temp = str.charAt(i) + ""; //Using a temp string as a parameter for the "if statement"
            if(temp.equals("M") || temp.equals("m") && c < 3){
                c++;
                continue; //Using continue to restart the whole loop before it executes the rest of it
            }
            newStr += temp;
        }
        System.out.println("The new string is: " + newStr);
    }
}



