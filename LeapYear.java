import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=obj.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is the Leap Year.");
                }
                else
                {
                    System.out.println(year+" is not the Leap Year");
                }
            }
            else
            {
                System.out.println(year+" is the Leap year.");
            }
        }
        else
        {
            System.out.println(year+" is not the leap Year");
        }
    }
}