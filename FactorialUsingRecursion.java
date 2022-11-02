import java.util.Scanner;
class FactorialUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }

    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
}