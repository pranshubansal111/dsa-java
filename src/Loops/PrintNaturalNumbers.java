package Loops;

import java.util.Scanner;

// code to print 'n' natural numbers
public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers upto which you want to print: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
