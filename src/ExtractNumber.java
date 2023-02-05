/*
Question : Write a program to extract number from given number.
 */
import java.util.Scanner;
public class ExtractNumber {
    public static void main(String[] args) {
        int a,temp,i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        a = sc.nextInt();
        System.out.println("First printing the original number : " + a);
        System.out.println("Now, printing the result :");
        while (a > 0){
            temp = a % 10;
            System.out.println("Printing the " + i + " number : " + temp);
            i++;
            a = a / 10;
            System.out.println();
        }
   }
}

