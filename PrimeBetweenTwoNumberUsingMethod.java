import java.util.Scanner;
class PrimeBetweenTwoNumberUsingMethod
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        prime(n1,n2);
    }

    public static void prime(int n1,int n2)
    {
        int i,j;
        for(i=n1;i<=n2;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
            }
        }
    }
}