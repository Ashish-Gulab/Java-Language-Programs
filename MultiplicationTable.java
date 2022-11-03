import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        System.out.println("The Multiplication Table of "+n+" is:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}