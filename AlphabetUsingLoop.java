import java.util.Scanner;
class AlphabetUsingLoop
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first character:");
        char ch=obj.next().charAt(0);
        System.out.println("The Alphabets are:");
        for(int i=0;i<26;i++)
        {
            System.out.println(ch);
            ch++;
        }
    }
}