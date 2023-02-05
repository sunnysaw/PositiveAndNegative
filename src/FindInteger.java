import java.util.Scanner;
/*
Question : Write a program to check whether the number is divisible by 5 or not.
 */
public class FindInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        if(a % 5 == 0){
            System.out.println("Yes, number is divisible by 5 " + a);
        }else
            System.out.println("No, number is divisible by 5 " + a);
    }
}
