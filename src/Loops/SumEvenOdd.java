package Loops;

import java.util.Scanner;

//code to calculate sum of odd numbers and even numbers entered by user
public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum=0;
        int oddSum=0;
        char ch;
        do{
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num%2==0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }
            System.out.println("want to add more numbers: Press Y or y.");
            ch = sc.next().charAt(0);
        }while (ch=='Y' || ch=='y');

        System.out.println("Sum of Even numbers = " + evenSum);
        System.out.println("Sum of Odd numbers = " + oddSum);
    }
}
