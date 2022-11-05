import java.util.Scanner;
class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=obj.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch+" is vowel.");
        }
        else
        {
            System.out.println(ch+" is consonant.");
        }
    }
}