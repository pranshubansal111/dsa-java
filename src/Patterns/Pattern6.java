package Patterns;

/*
    A
    B C
    D E G
    G H I J

 */

public class Pattern6 {

    public static void pattern(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
