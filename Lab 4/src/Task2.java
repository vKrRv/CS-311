import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        text();
        String password = input.nextLine();
        check(password);
    }


    public static void text(){
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits.\n \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.):");
    }

    public static String check(String str){
        if(str.length() < 8){
            System.out.println("Password is invalid!");
        }
        else{
            for(int i = 0; i < str.length(); i++){
                char temp = str.charAt(i);
                if(!Character.isLetterOrDigit(temp)){
                    System.out.println("Password is invalid!");
                }
                else{
                    int c = 0;
                    for(i = 0; i < str.length(); i++){
                        temp = str.charAt(i);
                        if(Character.isDigit(temp)){
                            c++;
                        }
                    }
                    if(c < 2){
                        System.out.println("Password is invalid!");
                    }
                    else{
                        System.out.println("Password is valid: " + str);
                    }
                }
            }
        }
    return str;
    }
}
