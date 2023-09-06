import java.util.Scanner;

class NumberAsASumOfTwoPrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        boolean primeNot=true;
        for(int i=2;i<=n/2;i++)
        {
            if(primeNumber(i))
            {
                if(primeNumber(n-i))
                {
                    primeNot=false;
                    System.out.println(i+" "+(n-i));
                }
            }
        }
        if(primeNot)
        {
            System.out.println("It cannot be write as a sum of two prime Numbers");
        }
    }

    public static boolean primeNumber(int n)
    {
        boolean prime=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
        {
            return true;
        }
        return false;
    }
}
