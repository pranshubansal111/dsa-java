package Loops;

//program to check whether the number is prime or not
public class PrimeNumber {

    //method 1 : best approach to check for a prime number
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    //method 2 : check for prime on the basis of factor
    public static boolean checkPrime2(int num){
        int factor=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                factor++;
            }
        }

        if(factor==2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(-10));
        System.out.println(checkPrime(0));
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(3));
        System.out.println(checkPrime(5));
    }
}
