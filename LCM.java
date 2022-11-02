import java.util.Scanner;
class LCM
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        int n=0,result=0;
        if(n1>n2)
        {
            n=n1;
        }
        else
        {
            n=n2;
        }
        // for(int i=n;i<=(n1*n2);i++). This is used when n will be the smaller one.
        int i=n;
        while(true)
        {
            if(i%n1==0 && i%n2==0)
            {
                result=i;
                break;
            }
            i++;
        }
        System.out.println("The LCM of "+n1+" and "+n2+" is: "+result);
    }
}