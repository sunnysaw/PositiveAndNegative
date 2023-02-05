/*
Question : Write a java program to check to find largest among three number.
 */
import java.util.Scanner;
public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        System.out.println("Enter the third number :");
        c = sc.nextInt();
        System.out.println("Now, calculating the number :");
        if (a > b && a > c){
            System.out.println("Number 'a' is greater : " + a);
        } else if (b > a && b > c) {
            System.out.println("Number 'b' is greater : " + b);
        }else
            System.out.println("Number 'c' is greater : " + c);
    }
}
