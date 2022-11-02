import java.util.Scanner;
class LargestElementOfArray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("The Array is: \n { ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
        int largest=arr[0],smallest=arr[0];
        for(int i=0;i<n;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        System.out.println("The largest element of the Array is: "+largest);
        System.out.println("The smallest element of the Array is: "+smallest);
    }
}