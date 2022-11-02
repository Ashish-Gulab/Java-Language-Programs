import java.util.Scanner;
class FactorsOfNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int i;
        System.out.println("Factors of "+n+" is :");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}