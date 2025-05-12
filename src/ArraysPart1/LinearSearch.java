package ArraysPart1;

import java.util.Scanner;

//Linear Search in an array
public class LinearSearch {

    public static int lSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("element found");
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10,34,552,1,44,5,50};

        System.out.println("Enter element to search for - ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println(lSearch(array,key));
    }
}
