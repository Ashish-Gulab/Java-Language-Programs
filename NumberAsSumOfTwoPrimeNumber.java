import java.util.Scanner;
class NumberAsSumOfTwoPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        boolean primenum=false;
        for(int i=2;i<n/2;i++)
        {
            if(primeNumber(i))
            {
                if(primeNumber(n-i))
                {
                    System.out.println(n+" = "+i+" + "+(n-i));
                    primenum=true;
                }
            }
        }
        if(primenum==false)        
            {
                System.out.println(n+" cannot be expressed as a sum of two prime numbers.");
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
        return prime;
    }
}