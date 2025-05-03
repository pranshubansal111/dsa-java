    package Loops;

    import java.util.Scanner;

    //code to reverse a number
    public class ReverseNumber {
        public static void main(String[] args) {
            System.out.println("Enter any number to reverse it");
            Scanner sc = new Scanner(System.in);
            if(!sc.hasNextInt()){
            System.out.println("Invalid input! Please enter a valid integer.");
        }
            else{
                int n = sc.nextInt();
                int rev = 0;
                while (n != 0) {
                    int rem = n % 10;
                    rev = rev * 10 + rem;
                    n = n / 10;
                }

                //printing reverse number
                System.out.println("The reversed number is = " + rev);
            }
        }
    }
