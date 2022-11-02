import java.util.Scanner;
class AverageUsingArray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements:");
        int sum=0,avg=0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println("The Average is: "+avg);
    }
}


/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac AverageUsingArray.java } ; if ($?) { java AverageUsingArray }
Enter the number of Elements:
6
Enter the Elements:
4 5 8 2 3 1
The Average is: 3
PS C:\Users\DELL\Documents\Java Programs> 
