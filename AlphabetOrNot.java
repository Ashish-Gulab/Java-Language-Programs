import java.util.Scanner;
class AlphabetOrNot
{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=obj.next().charAt(0);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) 
        {
            System.out.println("The Character is Alphabet.");
        }
        else{
            System.out.println("The Character is not Alphabet.");
        }
    }
}

/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac AlphabetOrNot.java } ; if ($?) { java AlphabetOrNot }
Enter the character
A
The Character is Alphabet.
PS C:\Users\DELL\Documents\Java Programs> 
