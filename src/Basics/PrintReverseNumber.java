package Basics;

import java.util.Scanner;

//code to print number in reverse
public class PrintReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }
}
