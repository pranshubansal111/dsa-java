package Conditionals;

import java.util.Scanner;

//code to calculate largest of three numbers
public class LargestOfThreeNumbers {

        //using if-else block
        public static int largest(int a, int b, int c){
            if(a>b) {
                if (a > c) {
                    return a;
                }
                else{
                    return c;
                }
            }
            else {
                if(b>c){
                    return b;
                }
                else{
                    return c;
                }
            }
        }

        //using ternary operator
        public static int largest1(int a, int b, int c){
            int largestNumber = ( ((a>b)?a:b) > c )? ((a>b)?a:b) : c;
            return largestNumber;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the largest of three - ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Largest = " + largest(num1, num2, num3));
    }
}
