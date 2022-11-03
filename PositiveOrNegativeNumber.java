import java.util.Scanner;
class PositiveOrNegativeNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        if(n>=0)
        {
            System.out.println(n+" is positive number.");
        }
        else
        {
            System.out.println(n+" is the negative number.");
        }
    }
}