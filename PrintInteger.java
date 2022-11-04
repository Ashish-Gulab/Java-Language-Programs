import java.util.Scanner;
class PrintInteger
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        System.out.println("You Entered the number:"+n);
    }
}