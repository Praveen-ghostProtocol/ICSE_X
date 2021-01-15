import java.util.*;
public class MarkSheet15 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = input.nextInt();

        // Student s = new Student();
        // s.rollno = 1;
        // s.names ="praveen";
        
        // HashMap<Integer, Student> table = new HashMap<Integer, Student>();

        // table.put(s.rollno,s);

        // s = new Student();
        // s.rollno = 2;
        // s.names ="shanker";
        // s.phy = 81;
        // s.chem=29;
        // s.math = 34;
        // s.average = (s.chem+s.phy+s.math)/3.0;
        // table.put(s.rollno,s);

        // Student searched = table.get(1);


        int[] rollno = new int[n];
        String[] names = new String[n];
        int[] m1 = new int[n];
        int[] m2 = new int[n];
        int[] m3 = new int[n];
        double[] average = new double[n];
        String[] grades = new String[n];

        System.out.println("enter the names of all students");
        for(int i =0;i<names.length;i++)
        {
            input.nextLine();//flushing away the enter key
            names[i]= input.nextLine();
        }
        System.out.println("enter the roll numbers of all students");
        for(int i =0;i<rollno.length;i++)
        {
            rollno[i]= input.nextInt();
        }
        System.out.println("enter the marks in first subject of all students");
        for(int i =0;i<m1.length;i++)
        {
            m1[i]= input.nextInt();
        }
        System.out.println("enter the marks in second subject of all students");
        for(int i =0;i<m2.length;i++)
        {
            m2[i]= input.nextInt();
        }
        System.out.println("enter the marks in third subject of all students");
        for(int i =0;i<m3.length;i++)
        {
            m3[i]= input.nextInt();
        }
        for(int i =0;i<average.length;i++)
        {
            average[i] = (m1[i]+m2[i]+m3[i] )/ 3.0;
        }

        for(int i =0;i<n;i++)
        {
            if(average[i] >=85 && average[i]<=100)
            {
                grades[i]= "Excellent";
            }
            else if(average[i]>=75 && average[i]<85)
            {
                grades[i]= "Distinction";
            }
            else if(average[i]>=60 && average[i]<75)
            {
                grades[i]= "First Class";
            }
            else if(average[i]>=40 && average[i]<60)
            {
                grades[i]= "Pass";
            }
            else if(average[i]<40)
            {
                grades[i]= "Poor";
            }
            
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(names[i]+" whose roll number is "+ rollno[i]+" has achieved a grade of "+grades[i]+" with an average marks of "+average[i]);
        }
        input.close();
    }
}
