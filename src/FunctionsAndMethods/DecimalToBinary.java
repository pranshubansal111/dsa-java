package FunctionsAndMethods;

//code to find the binary equivalent of a decimal number
public class DecimalToBinary {

    public static void decToBin(int decimalNum){
        int bin = 0;
        int i=0;
        while(decimalNum!=0){
            int rem = decimalNum % 2;
            bin += rem * (int)Math.pow(10,i);
            decimalNum = decimalNum / 2;
            i++;
        }
        System.out.println("Binary equivalent of a decimal num is " + bin);
    }

    public static void main(String[] args) {
        decToBin(8);
        decToBin(29);
    }
}
