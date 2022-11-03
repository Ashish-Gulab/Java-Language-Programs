import java.util.Scanner;
class MultiplicationOfTwoMatrices
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of the first Matrix:");
        int r1=obj.nextInt();
        System.out.println("Enter the number of the columns of the first Matrix:");
        int c1=obj.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the elements of the first Matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=obj.nextInt();
            }
        }
        System.out.println("The first Matrix is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter the number of rows of the second Matrix:");
        int r2=obj.nextInt();
        System.out.println("Enter the number of columns of the second Matrix: ");
        int c2=obj.nextInt();
        if(c1==r2)
        {
            int[][] arr2=new int[r2][c2];
            System.out.println("Enter the elements of the second Matrix:");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    arr2[i][j]=obj.nextInt();
                }
            }
            System.out.println("The second Matrix is:");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println("\n");
            }
            int[][] arr=new int[r1][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        arr[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("The Multiplication of matrices is:");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("\n");
            }
        }
        else 
        {
            System.out.println("Enter the correct input.");
        }
    }
}