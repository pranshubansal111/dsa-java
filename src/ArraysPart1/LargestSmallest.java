package ArraysPart1;

//code to find minimum and maximum element in an array
public class LargestSmallest {

    public static void minMax(int arr[]){

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){

            //finding largest element
            if(arr[i]>max){
                max=arr[i];
            }

            //finding smallest element
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);
    }

    public static void main(String[] args) {
        int arr[]={10,34,456,3,1,2,34,5,6,3,77,5};

        //calling method
        minMax(arr);
    }
}
