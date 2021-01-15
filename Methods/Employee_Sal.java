package Methods;


import java.util.*;
public class Employee_Sal
{
    String name;
    String empno;
    int basic;
    double gross,net;
    
    Employee_Sal()
    {
        name = "";
        empno= "";
        basic = 0;
    }
    
    void Input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        name = ob.nextLine();
        System.out.println("Enter the number of the employee");
        empno = ob.nextLine();
        System.out.println("Enter the basic salary of the employee");
        basic = ob.nextInt();
        ob.close();
    }
    
    void compute()
    {
        double da = (30/100.0)*basic;
        double hra = (15/100.0)*basic;
        double pf = (12/100.0)*basic;
        gross = basic+da+hra+pf;
        net = gross-pf;
    }
    void display()
    {
        System.out.println("the name of the employee "+name);
        System.out.println("number of the employee "+empno);
        System.out.println("basic salary of the employee "+basic);
        System.out.println("gross salary of the employee "+gross);
        System.out.println("net salary of the employee "+net);
    }
    
    public static void main(String[] args) 
    {
        Employee_Sal ob = new  Employee_Sal();
        ob.Input();
        ob.compute();
        ob.display();
    }
    
}
