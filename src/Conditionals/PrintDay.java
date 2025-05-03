package Conditionals;

import java.util.Scanner;

//code to demonstrate use of switch block
public class PrintDay {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7 to get the day:");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input. Please enter number between 1-7");
        }
    }
}
