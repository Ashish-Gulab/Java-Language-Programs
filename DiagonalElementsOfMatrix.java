import java.util.Scanner;
class DiagonalElementsOfMatrix
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int r=obj.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int c=obj.nextInt();
        System.out.println("Enter the elements of the Matrix:");
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Diagonal Elements of the Matrix are:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}