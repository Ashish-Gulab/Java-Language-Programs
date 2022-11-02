import java.util.Scanner;
class GCDUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int gcd=gcd(n1,n2);
        System.out.println("The GCD of "+n1+" and "+n2+" is "+gcd);
    }

    public static int gcd(int n1,int n2)
    {
        if(n1==0)
        {
            return n2;
        }
        else if(n2==0)
        {
            return n1;
        }
        else if(n1>n2)
        {
            return gcd(n1%n2,n2);
        }
        else
        {
            return gcd(n1,n2%n1);
        }
    }
}