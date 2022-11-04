import java.util.Scanner;
class QuadraticRoots
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the coefficient of x^2, i.e, a= ");
        double a=obj.nextDouble();
        System.out.println("Enter the coefficient of x ,i.e, b= ");
        double b=obj.nextDouble();
        System.out.println("Enter the coefficient of 1 ,i.e, c= ");
        double c=obj.nextDouble();
        double d=b*2-(4*a*c);
        double r1,r2;
        if(d>0)
        {
            r1=(-b+Math.sqrt(4*a*c))/(2*a);   
            r2=(-b-Math.sqrt(4*a*c))/(2*a);   
            System.out.format("Root1= %.2f and Root2= %.2f",r1,r2);
        }
        else if(d==0)
        {
            r1=r2=-b/(2*a);
            System.out.format("Root1= %.2f and Root2= %.2f",r1,r2);
        }
        else
        {
            double real=-b/(2*a);
            double imaginary= Math.sqrt(-d)/(2*a);
            System.out.format("Root1= %.2f+%.2fi", real,imaginary);
            System.out.format("\nRoot2= %.2f-%.2fi", real,imaginary);
        }
    }
}