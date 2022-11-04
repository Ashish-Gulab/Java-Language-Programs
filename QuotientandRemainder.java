import java.util.Scanner;
class QuotientandRemainder
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the divident:");
        int d=obj.nextInt();
        System.out.println("Enter the divisor:");
        int n=obj.nextInt();
        System.out.println("The Quotient is: "+(d/n));
        System.out.println("The Remainder is: "+(d%n));
    }
}