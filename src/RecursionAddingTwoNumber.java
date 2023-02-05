/*
Question : Write a program to add the sum of given number using recursion,
 */
import java.util.Scanner;
public class RecursionAddingTwoNumber {
    int sum = 0;
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        RecursionAddingTwoNumber obj = new RecursionAddingTwoNumber();
        int a = obj.add(n);
        System.out.println("Sum:"+a);
    }
    int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return sum + add(n / 10);
        }
    }
}
