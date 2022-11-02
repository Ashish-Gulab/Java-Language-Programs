import java.util.Scanner;
class CountDigits
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int count=0, num=n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("The number of Digits in "+num+" is: "+count);
    }
}