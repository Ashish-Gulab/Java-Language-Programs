import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t>0)
		{
		    int n3=0;
		    int n1=obj.nextInt();
		    int n2=obj.nextInt();
		      n3=n1/n2;
		    System.out.println(n3);
		}
	}
}
