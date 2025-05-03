package FunctionsAndMethods;

//code to print prime numbers between the given ranges
public class PrimeNumberInRange {

    public static void primeList(int start, int end){
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            if(i<=1){
                isPrime=false;
            }
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        primeList(10, 20);
//        primeList(0, 100);
//        primeList(-50, 50);

    }
}
