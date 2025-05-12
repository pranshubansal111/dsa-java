package ArraysPart1;

//code to print max, min, second max and second min element in an array
public class SecondMinMax {

    private static void secondMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            //finding min and second min element
            if(arr[i]<min){
                secondmin = min;
                min = arr[i];
            }
            else if(secondmin>arr[i] && arr[i]!=min){
                secondmin=arr[i];
            }

            //finding max and second max element
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(secondmax<arr[i] && arr[i]!=max){
                secondmax = arr[i];
            }
        }
        System.out.println("Minimum = " + min);
        System.out.println("Second Minimum = " + secondmin);
        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = "+secondmax);
    }

    public static void main(String[] args) {
        int arr[] = {1,34,22,4,4556,67,7,32};

        //calling method
        secondMinMax(arr);
    }

}
