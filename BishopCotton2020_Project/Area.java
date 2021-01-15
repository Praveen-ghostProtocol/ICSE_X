import java.util.Scanner;

public class Area 
{
    public static void area(int base, int height)
    {
        int area = base*height;
        System.out.println("The area of the parallelogram is "+(area));
    }
    public static void area(double d1, double d2)
    {
        double area = 0.5*d1*d2;
        System.out.println("The area of the rhombus is " + (area));
    }
    public static void area(double a, double b, double h)
    {
        double area  = 0.5* (a+b)* h;
        System.out.println("The area of the trapezium is " + (area));
    }

    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        System.out.println("1. Area of parallelogram");
        System.out.println("2. Area of Rhombus");
        System.out.println("3. Area of Trapezium");
        System.out.println("Please enter your choice");
        int uc = input.nextInt();

        switch(uc)
        {
            case 1:
            {
                System.out.println("Enter the value of the base");
                int base = input.nextInt();

                System.out.println("Enter the value of the base");
                int height = input.nextInt();

                area(base,height);
                break;
            }
            case 2:
            {
                System.out.println("Enter the value of the base");
                double d1 = input.nextDouble();

                System.out.println("Enter the value of the base");
                double d2 = input.nextDouble();

                area(d1,d2);
                break;
            }
            case 3:
            {
                System.out.println("Enter the value of the base");
                double a = input.nextDouble();

                System.out.println("Enter the value of the base");
                double b = input.nextDouble();

                System.out.println("Enter the value of the base");
                double h = input.nextDouble();

                area(a, b, h);
                break;
            }

            default:
            {
                System.out.println("Wrong number entered , please try again");
            }
        }
        input.close();
    }
}
