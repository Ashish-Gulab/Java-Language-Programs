import java.util.Scanner;
class FibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int secondLast=0, last=1,result=0;
        if(n==1)
        {
            System.out.println(secondLast);
        }
        else if(n==2)
        {
            System.out.println(last);
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                result=secondLast+last;
                secondLast=last;
                last=result;
            }
            System.out.println(last);
        }
    }
}