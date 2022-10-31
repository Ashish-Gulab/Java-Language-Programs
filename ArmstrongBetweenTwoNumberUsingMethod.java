import java.util.Scanner;
class ArmstrongBetweenTwoNumberUsingMethod
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        armstrong(n1,n2);
    }

    public static void armstrong(int n1,int n2)
    {
        int i,num=0,n=0,number=0;
        for(i=n1;i<=n2;i++)
        {
            int count=0;
            int result=0;
            num=i;
            n=i;
            while(num>0)
            {
                num=num/10;
                count++;
            }
            while(n>0)
            {
                number=n%10;
                result=result+(int)Math.pow(number,count);
                n=n/10;
            }
            if(i==result)
            {
                System.out.println(i);
            }
        }
    }
}