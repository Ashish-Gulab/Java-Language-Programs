import java.util.Scanner;
class ArmstrongbetweenTwoNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The two numbers:");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int i,j,num=0,number=0,number1=0;
        if(n1>n2)
        {
            System.out.println("Enter the correct input.");
        }
        else
        {
            System.out.println("The Armstrong Numbers between "+n1+" and "+n2+" is:");
            for(i=n1;i<=n2;i++)
            {   
                int count=0;
                int result=0;
                num=i;
                number1=i;
                while(number1>0)
                {
                    count++;
                    number1=number1/10;
                }
                while(num>0)
                {
                    number=num%10;
                    result=result+(int)Math.pow(number,count);
                    num=num/10;
                }
                if(i==result)
                {
                System.out.println(result);
                }
            }
        }
    }
}



/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac ArmstrongbetweenTwoNumber.java } ; if ($?) { java ArmstrongbetweenTwoNumber }
Enter The two numbers:
100 500
The Armstrong Numbers between 100 and 500 is:
153
370
371
407
PS C:\Users\DELL\Documents\Java Programs> 
