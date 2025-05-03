package Loops;

import java.util.Scanner;

//code to calculate factorial of a number
public class Calculatefactorial {

    public static int factorial(int n){
        int fact=1;
        if(n<0){
            return -1;
        }
        else if(n==0 || n==1){
            return 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number to find its factorial : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));

        //calling function for other inputs
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(-10));
        System.out.println(factorial(5));
    }
}
