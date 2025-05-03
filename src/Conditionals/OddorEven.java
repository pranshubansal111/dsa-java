package Conditionals;

import java.util.Scanner;

//code to check whether the number input by user is odd or even
public class OddorEven {

    public static void OddEven(int n){
        if(n%2==0){
            System.out.println(n + " is EVEN");
        }
        else{
            System.out.println(n + " is ODD");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        OddEven(num);
    }
}
