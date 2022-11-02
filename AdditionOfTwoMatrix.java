import java.util.Scanner;
class AdditionOfTwoMatrix
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of the Matrix:");
        int r=obj.nextInt();
        System.out.println("Enter the number of columns of the Matrix:");
        int c=obj.nextInt();
        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements of the First Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=obj.nextInt();
            }
        }
        System.out.println("The first Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter the elements of the second Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=obj.nextInt();
            }
        }
        System.out.println("The second Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("\n");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Addition is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}



/*********************************** OUTPUT **************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac AdditionOfTwoMatrix.java } ; if ($?) { java AdditionOfTwoMatrix }
Enter the number of rows of the Matrix:
3
Enter the number of columns of the Matrix:
3
Enter the elements of the First Matrix:
5 6 8 2 4 7 8 5 1  
The first Matrix is:
5 6 8 

2 4 7 

8 5 1 

Enter the elements of the second Matrix:
5 6 2 3 1 2 4 5 7
The second Matrix is:
5 6 2 

3 1 2 

4 5 7

Addition is:
10 12 10

5  5  9

12 10 8
PS C:\Users\DELL\Documents\Java Programs> 
