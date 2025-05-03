package FunctionsAndMethods;

//code to calculate factorial of a number using methods
public class FactorialCaculate {

    public static long factorial(int num){
        long fact = 1;

        if(num<0){
            return -1;
        }

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(-10));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(5));
    }
}
