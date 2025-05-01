package Basics;

import java.util.Scanner;

//Code to print sum of n natural numbers
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms - ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of natural numbers = " + sum);
    }
}
