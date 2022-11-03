import java.util.Scanner;
class NumberReverse
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
        System.out.println("The Reverse of the "+number+" is: "+reverse);
    }
}