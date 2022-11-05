import java.util.Scanner;
class TransposeOfMatrix
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of the Matrix:");
        int r=obj.nextInt();
        System.out.println("Enter the number of columns of the Matrix:");
        int c=obj.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("Enter the elements of the Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        int [][] arr1=new int[c][r];
        System.out.println("Transpose of the Matrix is:");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("\n");
        }
    }
}