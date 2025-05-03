package FunctionsAndMethods;

import java.util.Scanner;

//code to calculate the sum of digits of a number
public class DigitSum {

    public static int sumDigit(int num){
        int sum=0;
        while (num!=0){
            int rem=num%10;
            sum += rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {

        //calling method
        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(0));
        System.out.println(sumDigit(9992));

    }
}
