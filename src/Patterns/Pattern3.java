package Patterns;

/*
    * * * *
    * * *
    * *
    *
 */

public class Pattern3 {

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
