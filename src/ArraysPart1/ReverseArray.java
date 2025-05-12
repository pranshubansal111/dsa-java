package ArraysPart1;

import java.util.Arrays;

//code to reverse an array
public class ReverseArray {

    public static void reverseArray(int arr[]){
        for(int i=0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("Arrays before reversal");
        System.out.println(Arrays.toString(arr));

        //calling method
        reverseArray(arr);

        System.out.println("Arrays after reversal");
        System.out.println(Arrays.toString(arr));
    }
}
