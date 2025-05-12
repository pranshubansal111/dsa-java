package ArraysPart1;

//code to find element in an array using Binary Search
//Prerequisite: Sorted array is required.

public class BinarySearch {

    public static int bSearch(int arr[], int key){

        if(arr==null || arr.length==0){
            System.out.println("array is empty");
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(key==arr[mid]){
                System.out.println("element found");
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        System.out.println("element not found");
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,10,12};

        int key = 10;
        //calling method
        System.out.println(bSearch(arr,key));
    }
}
