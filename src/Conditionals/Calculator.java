package Conditionals;

import java.util.Scanner;

//code to create a basic calculator using switch block
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to perform the operation");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation to be performed : + , - , / , * , %");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            case '%' :
                if (num2 == 0) {
                    System.out.println("Cannot perform modulo by zero");
                } else {
                    System.out.println(num1 % num2);
                }
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
