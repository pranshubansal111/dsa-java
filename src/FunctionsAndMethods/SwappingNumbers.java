package FunctionsAndMethods;

import java.util.Scanner;

//code to swap two numbers in Java
public class SwappingNumbers {

    public static void swap(int a, int b){

        System.out.println("Before Swapping");
        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers to swap");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1, num2);
    }

}
