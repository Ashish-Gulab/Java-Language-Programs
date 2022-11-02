import java.util.Scanner;
class LargestInThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        System.out.println("Enter the third number:");
        int n3=obj.nextInt();
        // if(n1>=n2 && n1>=n3)
        // {
        //     System.out.println(n1+" is the largest number");
        // }
        // else if(n2>=n1 && n2>=n3)
        // {
        //     System.out.println(n2+" is the largest number");
        // }
        // else
        // {
        //     System.out.println(n3+" is the largest number");
        // }
        int max=Math.max(n3,Math.max(n1,n2));
        System.out.println("The maximum number is:"+max);
    }
}