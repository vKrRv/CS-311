import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] rainfallRate = new int[4][7];
        dataIn(rainfallRate);
        double[] avg = new double[4];
        getAverage(avg, rainfallRate);
        getClassification(avg);

    }


    public static void dataIn(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rainfall rate for 4 weeks");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Week#" + (i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static double getAverage(double[] arr1, int[][] arr2) {
        double sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = 0;
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
            arr1[i] = sum / 7;
        }

        return 0;
    }

    public static void  getClassification(double[] arr){
        System.out.println("Classification for each week:");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 6){
                System.out.println("Week#" + (i + 1) + ": High (" + arr[i] + ")");
            }
            else if(arr[i] > 3 && arr[i] < 6){
                System.out.println("Week#" + (i + 1) + ": Medium (" + arr[i] + ")");

            }
            else{
                System.out.println("Week#" + (i + 1) + ": Low (" + arr[i] + ")");
            }
        }
    }
}