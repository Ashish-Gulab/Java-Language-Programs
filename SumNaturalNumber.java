import java.util.Scanner;
class SumNaturalNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to which the sum is to be calculated.");
        int n=obj.nextInt();
        int sum=0,i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The Sum of "+n+" natural numbers is "+sum);
    }
}