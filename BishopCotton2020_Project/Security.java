import java.util.Scanner;

public class Security 
{
    static String n;
    int h;
    double r;
    double w;
    

    public Security(String name, int hours, double rate)
    {
        n=name;
        h=hours;
        r=rate;
        w=0.0;
    }

    public void calwage()
    {
        
        if(h>70)
        {
            System.out.println("The security is not allowed to work more than 70 hours");
            System.exit(0);
            return;
        }
        if(h<=40)
        {
            w = h*r; 
        }
        if(h>40 && h<=60)
        {
            w = (40*r)+((h-40)*r*1.5);
        }
        if(h>60 && h<=80)
        {
            w = (40*r)+(20*r*1.5)+((h-60)*2*r);
        }
    }

    public void Display()
    {
        System.out.println("Name \t Hours \t wages\t");
        System.out.println(n+"\t"+h+"\t"+w);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of guard");
        String name = input.nextLine();

        System.out.println("Enter the number of hours worked");
        int hours = input.nextInt();

        System.out.println("Enter the rate per hour");
        double rate = input.nextDouble();

        Security obj = new Security(name,hours,rate);
        obj.calwage();
        obj.Display();
        input.close();
    }
}
