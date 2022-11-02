import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is Even.");
        }
        else
        {
            System.out.println(n+" is Odd.");
        }
    }
}