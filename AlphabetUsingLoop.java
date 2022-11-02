import java.util.Scanner;
class AlphabetUsingLoop
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first character:");
        char ch=obj.next().charAt(0);
        System.out.println("The Alphabets are:");
        for(int i=0;i<26;i++)
        {
            System.out.println(ch);
            ch++;
        }
    }
}


/************************** OUTPUT ***********************************************************************************************************************************/

PS C:\Users\DELL\Documents\Java Programs> cd "c:\Users\DELL\Documents\Java Programs\" ; if ($?) { javac AlphabetUsingLoop.java } ; if ($?) { java AlphabetUsingLoop }
Enter the first character:
A
The Alphabets are:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
PS C:\Users\DELL\Documents\Java Programs> 
