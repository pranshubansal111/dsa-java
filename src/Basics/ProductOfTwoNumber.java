package Basics;

import java.util.Scanner;

//code to find product of two numbers
public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Product = " + (num1 * num2));
    }
}
