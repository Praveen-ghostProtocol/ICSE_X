import java.util.*;
public class Area
 {
     public static void areas(int base, int height)
     {
         int areaP = base*height;
         System.out.println("The area of the Parallelogram is "+areaP);
     }
     public static void areas(double d1, double d2)
     {
        double areaR = 0.5*d1*d2;
        System.out.println("The area of the Rhombus is "+areaR);
     }
     public static void areas(int a, int b , double h)
     {
        double areaT = 0.5*(a+b)*h;
        System.out.println("The area of the Trapezium is "+areaT);
     }
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.println("1.Area of Parallelogram");
         System.out.println("2.Area of Rhombus");
         System.out.println("3.Area of Trapezium");
         System.out.println("Please enter your choice");
         int uc = input.nextInt();

         switch(uc)
         {
            case 1:
            System.out.println("Enter the length of the base ");
            int base = input.nextInt();
            System.out.println("Enter the length of the height ");
            int height = input.nextInt();
            areas(base,height);
            break;


            case 2:
            System.out.println("Enter the length of the first diagonal ");
            double d1 = input.nextDouble();
            System.out.println("Enter the length of the second diagonal ");
            double d2 = input.nextDouble();
            areas(d1,d2);
            break;

            case 3:
            System.out.println("Enter the length of the first parallel side ");
            int a = input.nextInt();
            System.out.println("Enter the length of the second parallel side ");
            int b = input.nextInt();
            System.out.println("Enter the length of the distance between the parallel sides");
            double h = input.nextDouble();
            areas(a,b,h);
            break;

            default :
            System.out.println("Wrong number entered , please try again. Thank You!");
         }
         input.close();
     }
     
}
