package FunctionsAndMethods;

import java.util.Scanner;

//code to check if number entered by user is a palindrome or not
public class Palindrome {

    public static boolean isPalindrome(int num){

        if(num<0){
            return false;
        }

        int originalNum = num;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            rev = rev*10 + rem;
            num=num/10;
        }

        return originalNum == rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //calling method
        System.out.println(isPalindrome(num));
    }
}
