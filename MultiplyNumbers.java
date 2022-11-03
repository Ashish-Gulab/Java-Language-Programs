import java.util.Scanner;
class MultiplyNumbers
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first float number:");
        float n1=obj.nextFloat();
        System.out.println("Enter the second float number:");
        float n2=obj.nextFloat();
        System.out.println("The multiplication of two floats numbers is: "+(n1*n2));
    }
}