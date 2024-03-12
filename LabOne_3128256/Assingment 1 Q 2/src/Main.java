//Alfred Paulson - 3128256
//Encode Characters using Caesar Cipher

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the position to shift: ");
        int position = input.nextInt();

        System.out.print("Enter a character to encode: ");
        char character = input.next().charAt(0);

        int acsiivalue = (int) character;
        int encodeascii= acsiivalue + position;
        char encodecharacter= (char) encodeascii;
        System.out.println(character+" encoded is "+encodecharacter);

    }
}
