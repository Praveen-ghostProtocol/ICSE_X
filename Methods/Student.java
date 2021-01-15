package Methods;



import java.util.*;
public class Student
{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    int maximum;
    int average;

    public Student(String nameIN,int ageIN,int m1IN,int m2IN,int m3IN)
    {
        name = nameIN;
        age = ageIN;
        m1=m1IN;
        m2=m2IN;
        m3=m3IN;
    }
    
    public void  Compute()
    {
         average = (m1+m2+m3)/3;
        
        if(m1>=m2&&m1>=m3)
        {
            maximum = m1;
        }
        if(m2>=m3&&m1>=m3)
        {
            maximum = m2;
        }
        if(m1>=m2&&m1>=m3)
        {
            maximum = m3;
        }
        
    }
    
    void display()
    {
        System.out.println("Name of student : "+name);
        System.out.println("age of student : "+age);
        System.out.println("mark 1 of student : "+m1);
        System.out.println("mark 2 of student : "+m2);
        System.out.println("mark 3 of student : "+m3);
        System.out.println("maximum mark of student : "+maximum);
        System.out.println("average mark of student : "+average);
    }
    
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the following");
        System.out.println("Name of student : ");
        String nameIN=ob.nextLine();
        System.out.println("age of student : ");
        int ageIN = ob.nextInt();
        System.out.println("mark 1 of student : ");
        int m1IN = ob.nextInt();
        System.out.println("mark 2 of student : ");
        int m2IN = ob.nextInt();
        System.out.println("mark 3 of student : ");
        int m3IN = ob.nextInt();
        Student obj = new Student(nameIN,ageIN,m1IN,m2IN,m3IN);
        obj.Compute();
        obj.display();
        ob.close();
    }
}
