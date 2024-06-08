//rite a Java program to add two binary numbers.

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        long binary1, binary2;
        //Declare variables to store two binary numbers, index, remainder
        int i=0, remainder=0;
        //array to store the sum of binary digits
        int[] sum = new int[20];

        Scanner sc  = new Scanner(System.in);

        //Take user input
        System.out.println("Enter first binary number");
        binary1 = sc.nextLong();

        System.out.println("Enter second Binary Number");
        binary2 = sc.nextLong();

        //binary addition while there are digits in the binary number
        while (binary1 !=0 || binary2 !=0){
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        // If there is a remaining carry, add it to the sum
        if(remainder !=0){
            sum[i++] = remainder;
        }
         // Decrement the index to prepare for printing
        --i;
        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");   
    }
}
