import java.util.Scanner;
class CalculatorUsingSwitch
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the operator(+,-,*,/,%)");
        char operator=obj.next().charAt(0);
        System.out.println("Enter the first number:");
        int n1=obj.nextInt();
        System.out.println("Enter the second number:");
        int n2=obj.nextInt();
        switch(operator)
        {
            case'+':
                System.out.println("The Addition of "+n1+" and "+n2+" is: "+(n1+n2));
                break;
            case'-':
                System.out.println("The Subtraction of "+n1+" and "+n2+" is: "+(n1-n2));
                break;
            case'/':
                System.out.println("The division of "+n1+" and "+n2+" is: "+(n1/n2));
                break;
            case'*':
                System.out.println("The multiplication of "+n1+" and "+n2+" is: "+(n1*n2));
                break;
            case'%':
                System.out.println("The modulus of "+n1+" and "+n2+" is: "+(n1%n2));
                break;
            default:
                System.out.println("Enter the correct operator.");
        }
    }
}