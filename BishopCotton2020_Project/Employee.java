import java.util.Scanner;

public class Employee 
{
   static int code;
   static String name;
   static double basic;
   static double hra;
   static double da;
   static double PF;

   public Employee()
   {
       code=0;
       name="";
       basic=0.0;
       hra=0.0;
       da=0.0;
       PF=0.0;
   }

   public static void calculator()
   {
       hra = (10.0/100.0)*basic;
       da = (55.0/100.0)*basic;
       PF = 1000;
   }

   public static void main(String[] args)
   {
       //taking input using scanner class
       Scanner input = new Scanner(System.in);

       System.out.println("Please enter your name");
       name = input.nextLine();

       System.out.println("Please enter your basic salary");
       basic = input.nextDouble();

       calculator();
       double NetSalary = basic +da + hra - PF;
       System.out.println("Welcome "+name+" !!, your Net salary is "+ NetSalary);
       input.close();
   }

}
