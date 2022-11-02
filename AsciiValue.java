import java.util.Scanner;
class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=obj.next().charAt(0);
        int n=(int)ch;
        System.out.println("The Ascii Value of "+ch+" is "+n);
    }
}



/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac AsciiValue.java } ; if ($?) { java AsciiValue }
Enter the character:
c
The Ascii Value of c is 99
PS C:\Users\DELL\Documents\Java Programs>
