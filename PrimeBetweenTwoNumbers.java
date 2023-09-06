import java.util.Scanner;

class PrimeNumberBetweenTwoNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            boolean prime=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime)
            {
                System.out.print(i+" ");
            }
        }
    }
}
