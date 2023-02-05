/*
Question : Write a program to swap numbers.
 */

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping number : " + a + " " + b );
    }
}
