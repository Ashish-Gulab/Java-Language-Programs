import java.util.Scanner;
class ShellSort
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The unsorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        shell_sort(arr,n);
        System.out.println("\nThe sorted Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void shell_sort(int[] arr,int length)
    {
        int gap=length/2;
        while(gap>0)
        {
            int j=0;
            for(int i=gap;i<length;i++)
            {
                int a=arr[i];
                for(j=i;j>=gap && a<arr[j-gap];j=j-gap)
                {
                    arr[j]=arr[j-gap];
                }
                arr[j]=a;
            } 
            gap=gap/2;
        }
    }
}


/****************** OUTPUT ***************************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\Sorting\" ; if ($?) { javac ShellSort.java } ; if ($?) { java ShellSort }
Enter the number of elements to be sorted:
10
Enter the elements of the array:
6 7 3 4 1 7 9 4 3 2 
The unsorted array is:
6 7 3 4 1 7 9 4 3 2 
The sorted Array is:
1 2 3 3 4 4 6 7 7 9 
PS C:\Users\DELL\Documents\Java Programs> 
