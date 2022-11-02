import java.util.Scanner;
class checkElementIsInArray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number elements of the Array:");
        int n=obj.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("The Array is: \n{");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}\n");
        System.out.println("Enter the element to which we have to find that is it the part of the Array:");
        int n1=obj.nextInt();
        boolean check=false;
        int e=0;
        for(int i=0;i<n;i++)
        {
            if(n1==arr[i])
            {
                check=true;
                e=i;
            }
        }
        if(check==true)
        {
            System.out.println(n1+" is present in the Array at the index "+e);
        }
    }
}


/******************************** OUTPUT *************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac CheckElementIsInArray.java } ; if ($?) { java CheckElementIsInArray }
Enter the number elements of the Array:
5
Enter the elements of the Array:
6 8 6 3 4
The Array is: 
{6 8 6 3 4 }
Enter the element to which we have to find that is it the part of the Array:
3
3 is present in the Array at the index 3
PS C:\Users\DELL\Documents\Java Programs>
