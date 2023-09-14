import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a string: ");
        String string = input.nextLine();
        System.out.print("Enter a letter to delete: ");
        String charToDelete = input.next();
        deleteChar(string, charToDelete);
    }

    public static void deleteChar(String str1, String str2){
        System.out.print("The string after deleting the character '" + str2 + "': ");
        for(int i = 0; i < str1.length(); i++) {
            String temp = str1.charAt(i) + "";
            if(temp.equals(str2.toUpperCase()) || temp.equals(str2.toLowerCase())){
                //Simply do nothing and the character will be skipped
            }
            else{
                System.out.print(str1.charAt(i));
            }
        }
    }

}
