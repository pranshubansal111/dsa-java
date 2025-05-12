package ArraysPart1;

//code to print pairs in an array
public class ArrayPairs {

    public static void arrayPairs(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.println(arr[i] + " " + arr[j]);
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + count);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        //calling method
        arrayPairs(arr);
    }
}
