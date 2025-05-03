package Basics;

import java.util.Scanner;

//code to calculate average of three numbers
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find their average");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers is " + average);
    }
}
