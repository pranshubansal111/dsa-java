package FunctionsAndMethods;

//code to check whether a number is prime or not
public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 0 prime? " + isPrimeNumber(0));  // Expected output: false
        System.out.println("Is 1 prime? " + isPrimeNumber(1));  // Expected output: false
        System.out.println("Is 2 prime? " + isPrimeNumber(2));  // Expected output: true
        System.out.println("Is 3 prime? " + isPrimeNumber(3));  // Expected output: true
        System.out.println("Is 4 prime? " + isPrimeNumber(4));  // Expected output: false
        System.out.println("Is 29 prime? " + isPrimeNumber(29)); // Expected output: true
    }
}
