/*
Question : Write a program to check whether the number is negative or positive.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Number is  : " + a);
        System.out.println("Checking the number :");
        if (a >= 0){
            System.out.println(" The number is positive number :");
        }else
            System.out.println(" The number is negative number :");
    }
}