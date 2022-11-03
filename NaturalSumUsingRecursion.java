import java.util.Scanner;
class NaturalSumUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to which the sum is to be calculated:");
        int n=obj.nextInt();
        int sum=natural(n);
        System.out.println("Sum of natural numbers upto "+n+" is: "+sum);
    }

    public static int natural(int n)
    {
        if(n!=0)
        {
            return n+natural(n-1);
        }
        else
        {
            return n;
        }
    }
}