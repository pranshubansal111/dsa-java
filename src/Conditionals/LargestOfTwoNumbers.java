package Conditionals;

import java.util.Scanner;

//code to find largest of two numbers
public class LargestOfTwoNumbers {

    //method to find largest of two numbers
    public static int largest(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Largest number is " + largest(num1,num2));
    }
}