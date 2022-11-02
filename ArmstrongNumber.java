import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        int num=n, number=0,result=0,n1=n,count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(n>0)
        {
            number=n%10;
            result=result+(int)Math.pow(number,count);
            n=n/10;
        }
        if(n1==result)
        {
            System.out.println(n1+" is the Armstrong Number");
        }
        else
        {
            System.out.println(n1+" is not the Armstrong Number");
        }
    }
}


/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac ArmstrongNumber.java } ; if ($?) { java ArmstrongNumber }
Enter the number:
153
153 is the Armstrong Number
Enter the number:
103
103 is not the Armstrong Number
PS C:\Users\DELL\Documents\Java Programs> 
