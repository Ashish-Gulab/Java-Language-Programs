import java.util.Scanner;
class SwapTwoNumbers
{
    public static void main(String[] rags)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        System.out.println("The numbers before Swapping are: "+n1+" and "+n2);
        n2=n1+n2;
        n1=n2-n1;
        n2=n2-n1;
        System.out.println("The numbers after Swapping are: "+n1+" and "+n2);
    }
}