package Basics;

import java.util.Scanner;

//code to validate whether year entered by user is a leap year or not
public class ValidateLeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year to check whether it is a leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if( year%400==0 || (year%4==0 && year%100!=0) ){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
