import java.util.Scanner;
class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        System.out.println("Enter the exponant:");
        int e=obj.nextInt();
        int i=1,mul=1;
        while(i<=e)
        {
            mul=mul*n;
            i++;
        }
        System.out.println("The "+n+" raised to the power "+e+" is: "+mul);
    }
}