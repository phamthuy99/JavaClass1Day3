import java.util.Scanner;

public class bai_142 {

    public static double minArr(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        double[] arr1 = {1.0, 2.0, -5.5, 7.5, 9.7}; //-5.5
        double[] arr2 = {1.5, 7.5, 8.5, 1.0, 1.0, 2.4}; // 1.0

        System.out.println(minArr(arr1));
        System.out.println(minArr(arr2));

    }
}
