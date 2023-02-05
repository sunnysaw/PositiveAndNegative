/*
Question : Write a program to check whether the two number is equal or not.
 */

import java.util.Scanner;

public class NumberIsEqualOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Yes, the number is equal number :");
        }else
            System.out.println("No, the number is equal number : " + a + " " + b);
    }
}
