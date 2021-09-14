import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int binaryInt=Integer.parseInt(binary);
        int finalBin=0;
        int counter=0;
        while(binaryInt>0){
            //System.out.println(binaryInt);
            int lastDigit=binaryInt%10;
            //System.out.println(lastDigit);
            binaryInt=binaryInt/10;
            finalBin+=(lastDigit*(Math.pow(2,counter)));
            counter++;
        }
        return finalBin;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        StringBuilder finalDec= new StringBuilder();
        if (decimal==0){
            return ("0");
        }
        while (decimal>0){
            int remain=decimal%2;
            decimal/=2;
            String remainStr=String.valueOf(remain);
            finalDec.append(remainStr);
        }
        return String.valueOf(finalDec.reverse());
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String numBin=scan.nextLine();
        System.out.println("Here it is in decimal "+binaryToDecimal(numBin));
        System.out.println("Type in a number in decimal format: ");
        int numDec=scan.nextInt();
        System.out.println("Here it is in binary "+decimalToBinary(numDec));

    }
}
