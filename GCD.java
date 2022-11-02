import java.util.Scanner;
class GCD
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        int n=0,result=0;
        if(n1>n2)
        {
            n=n1;
        }
        else
        {
            n=n2;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                result=i;
            }
        }
        System.out.println("The GCD of "+n1+" and "+n2+" is: "+result);
    }
}