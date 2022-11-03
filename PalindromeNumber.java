import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int num=0,reverse=0,number=n;
        while(n>0)
        {
            num=n%10;
            reverse=reverse*10+num;
            n=n/10;
        }
        if(number==reverse)
        {
            System.out.println(number+" is Palindrome.");
        }
        else
        {
            System.out.println(number+" is not Palindrome.");
        }
    }
}