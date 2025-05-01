package Basics;

import java.util.Scanner;

//code to calculate sum of two numbers
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers - ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum is "+ (num1+num2));
    }
}
