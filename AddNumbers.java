import java.util.Scanner;
class AddNumbers
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        System.out.println("The Sum is:"+(n1+n2));
    }
}