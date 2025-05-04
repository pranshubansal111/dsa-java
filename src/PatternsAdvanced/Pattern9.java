package PatternsAdvanced;

/*
           *
         * * *
       * * * * *
     * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *

 Here, n = 4;

 */

public class Pattern9 {

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //reversing the outer loop to print the mirror image
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
