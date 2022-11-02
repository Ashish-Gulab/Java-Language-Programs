import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int secondLast=0,last=1;
        System.out.println("The Fibonacci Series of "+n+" is:");
        if(n==1)
        {
            System.out.println("0");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(secondLast+" ");
                int result=secondLast+last;
                secondLast=last;
                last=result;
            }
        }
    }
}