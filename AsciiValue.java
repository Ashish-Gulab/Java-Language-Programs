import java.util.Scanner;
class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=obj.next().charAt(0);
        int n=(int)ch;
        System.out.println("The Ascii Value of "+ch+" is "+n);
    }
}