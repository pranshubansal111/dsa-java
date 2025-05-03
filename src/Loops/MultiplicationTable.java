package Loops;

import java.util.Scanner;

//code to print multiplication table
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print its table - ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
