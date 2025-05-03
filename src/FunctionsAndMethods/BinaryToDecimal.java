package FunctionsAndMethods;

//code to find the decimal equivalent of a binary number
public class BinaryToDecimal {

    public static void binToDec(int binaryNum){
        int dec=0;
        int i=0;
        while(binaryNum!=0){
            int rem = binaryNum%10;
            dec += rem * (int)Math.pow(2,i);
            binaryNum = binaryNum / 10;
            i++;
        }
        System.out.println("Decimal equivalent is "+dec);
    }

    public static void main(String[] args) {
        binToDec(1000);
        binToDec(11101);
    }
}
