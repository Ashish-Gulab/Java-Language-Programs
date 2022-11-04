import java.util.Scanner;
class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        boolean prime=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                prime=false;
            }
        }
        if(prime==true)
        {
            System.out.println(n+" is the Prime Number.");
        }
        else
        {
            System.out.println(n+" is not the Prime Number.");
        }
    }
}