import java.util.*;
public class Marks 
{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    int maximum;
    double average;

    void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        name = input.nextLine();
        System.out.println("Enter the marks in first subject");
        m1= input.nextInt();
        System.out.println("Enter the marks in second subject");
        m2= input.nextInt();
        System.out.println("Enter the marks in third subject");
        m3= input.nextInt();
        input.close();
    }
    void compute()
    {
        average = (m1+m2+m3) / 3.0;
        if(m1>m2 && m2>m3)
        {
            maximum = m1;
        }
        else if(m2>m3)
        {
            maximum = m2;
        }
        else
        {
            maximum = m3;
        }
    }
    void display()
    {
        System.out.println("Name of the student is "+name);
        System.out.println("Marks in first subject is "+m1);
        System.out.println("Marks in second subject is "+m2);
        System.out.println("Marks in third subject is "+m3);
        System.out.println("Maximum Marks is"+maximum);
        System.out.println("Average marks is "+average);
    }
    public static void main(String[] args)
    {
        Marks obj = new Marks();
        obj.input();
        obj.compute();
        obj.display();
    }
}
