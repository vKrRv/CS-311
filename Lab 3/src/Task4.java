import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String cleanStr = str.replaceAll("\\s+", " ").trim();
        //This method helps to eliminate multiple spaces in a string and replace it with a single space
        //Ans ".trim()" function eliminate any starting and ending spaces
        //System.out.println(cleanStr); "Just an output to check how the string have been changed"
        int count = 1; //The counter set as 1 cuz the first word will never have spaces..
        //and only multiple words would be added to the counter
        for(int i = 0; i < cleanStr.length(); i++){
            String temp = cleanStr.charAt(i) + "";
            if(temp.equals(" ")){
                count++;
            }
        }
        System.out.println("Number of words = " + count);
    }
}
