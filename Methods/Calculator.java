package Methods;



import java.util.*;
/**
Calculator class 
 */
public class Calculator
{
    static void add(int a, int b)
    {
        int sum = a+b;
        System.out.println("Sum = "+ sum);
    }

    static void Subtract(int a, int b)
    {
        int diff = a-b;
        System.out.println("Difference = "+ diff);
    }

    static void Mutiply(int a, int b)
    {
        int prod = a*b;
        System.out.println("Product = "+ prod);
    }

    static void Quotient(int a, int b)
    {
        int quo = a/b;
        System.out.println("Quotient = "+ quo);
    }

    static void Remainder(int a, int b)
    {
        int rem = a%b;
        System.out.println("Remainder = "+ rem);
    }

    static void SquareRoot(int a )
    {
        double sqrt = Math.sqrt(a);
        System.out.println("Square Root of the number = "+ sqrt);

    }

    static void CubeRoot(int a)
    {
        double cbrt = Math.cbrt(a);
        System.out.println("Cube Root of first number = "+ cbrt);

    }

    static void Percentage()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of Subjects");
        int numberOfSubjects = ob.nextInt();
        double sumOfMarks = 0.0;
        for(int i = 1; i<= numberOfSubjects;i++)
        {
            System.out.println("Enter marks of Subject "+i+" (out of 100)");
            double SubjectMarks = ob. nextDouble();
            sumOfMarks += SubjectMarks;
        }
        double percentage = (sumOfMarks/(numberOfSubjects*100))*100;
        System.out.println("Your Percentage is "+ percentage);
        if(percentage>= 60.0&&percentage< 80.0)
        {
            System.out.println("You have passed in first class -- Congratulations!!");
        }
        else if(percentage>= 80.0)
        {
            System.out.println("You have passed in Distinction -- Congratulations!!");
        }
        else if(percentage>= 50.0&&percentage< 60.0)
        {
            System.out.println("You have passed in second class -- Good!!");
        }
        else if(percentage>= 40.0&&percentage< 50.0)
        {
            System.out.println("You have passed in third class -- Good but can Improve!!");
        }
        else if(percentage<40)
        {
            System.out.println("You have failed -- sorry you have to repeat the class!!");
        }
        ob.close();
    }

    static void Trigonometry()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Which Trigonometric value do you want to select?");
        System.out.println("1. sine");
        System.out.println("2. cosine");
        System.out.println("3. tangent");
        System.out.println("4. cosecant");
        System.out.println("5. secant");
        System.out.println("6. cotangent");
        System.out.println("Enter your choice");
        int UC = ob.nextInt();//Taking user choice
        System.out.println("Enter the value of the angle in radians");
        double angle = ob.nextInt();//Taking value of angle as input
        double value=0;
        switch(UC)
        {
            case 1:
            {
                value = Math.sin(angle);
                break;
            }
            case 2:
            {
                value = Math.cos(angle);
                break;
            }
            case 3:
            {
                value = Math.tan(angle);
                break;
            }
            case 4:
            {
                value = 1.0/Math.sin(angle);
                break;
            }
            case 5:
            {
                value = 1.0/Math.cos(angle);
                break;
            }
            case 6:
            {
                value = 1.0/Math.tan(angle);
                break;
            }
            default:
            {
                System.out.println("Wrong choice!! Try later");
            }
        }
        System.out.println("Trignometric value of the angle is = "+value);
        ob.close();
    }
    static void Logarithm(int logNumber)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Which Logarithm value do you want to select?");
        System.out.println("1. natural logs");
        System.out.println("2. logs to the base 10");
        System.out.println("Enter your choice");
        int UC = ob.nextInt();//Taking user choice
        double value=0;
        switch(UC)
        {
            case 1:
            {
                value = Math.log(logNumber);
                break;
            }
            case 2:
            {
                value = Math.log10(logNumber);
                break;
            }
            
            default:
            {
                System.out.println("Wrong choice!! Try later");
            }
        }
        System.out.println("The logarithmic value of the number entered is = "+value);
        ob.close();
    }
    static void TemperatureConverter()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Which Logarithm value do you want to select?");
        System.out.println("1. Celsius to Farenheit");
        System.out.println("2. Celsius to Farenheit");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("Enter your choice");
        int UC = ob.nextInt();//Taking user choice
        double value=0;
        double degrees = 0;
        switch(UC)
        {
            case 1:
            {
                System.out.println("Enter the degree in Celsius");
                degrees = ob.nextDouble();
                value = (degrees * (9.0/5.0)) + 32;
                break;
            }
            case 2:
            {
                System.out.println("Enter the degree in Farenheit");
                degrees = ob.nextDouble();
                value = (degrees - 32) * 5.0/9.0;
                break;
            }
            case 3:
            {
                System.out.println("Enter the degree in Celsius");
                degrees = ob.nextDouble();
                value = degrees + 273;
                break;
            }
            case 4:
            {
                System.out.println("Enter the degree in Kelvin");
                degrees = ob.nextDouble();
                value = (degrees - 273);
                break;
            }
            
            default:
            {
                System.out.println("Wrong choice!! Try later");
            }
        }
        System.out.println("The Converted value of the temperature entered is = "+value);
        ob.close();
    }

    static void main()
    {
        boolean flag;
        do
        {
            System.out.println("\f");
            Scanner ob = new Scanner (System.in);
            System.out.println("---------------------------MENU-----------------------------------");
            System.out.println("------------------------1.Addition--------------------------------");
            System.out.println("------------------------2.Subtract--------------------------------");
            System.out.println("------------------------3.Mutiply---------------------------------");
            System.out.println("------------------------4.Division--------------------------------");
            System.out.println("------------------------5.Remainder-------------------------------");
            System.out.println("------------------------6.Square Root-----------------------------");
            System.out.println("------------------------7.Cube Root-------------------------------");
            System.out.println("------------------------8.Percentage of Marks---------------------");
            System.out.println("------------------------9.Trigonometric values--------------------");
            System.out.println("------------------------10.Logarithmic values---------------------");
            System.out.println("------------------------11.Temperature Converter---------------------");
            System.out.println("Enter you choice");
            int uC = ob.nextInt();//Takin input
            
            //Switch case to execute the particular method
            switch(uC)
            {
                case 1:
                add(TakingInput(),TakingInput());
                break;

                case 2:
                Subtract(TakingInput(), TakingInput());
                break;

                case 3:
                Mutiply(TakingInput(), TakingInput());
                break;

                case 4:
                Quotient(TakingInput(), TakingInput());
                break;

                case 5:
                Remainder(TakingInput(), TakingInput());
                break;

                case 6:
                SquareRoot(TakingInput());
                break;

                case 7:
                CubeRoot(TakingInput());
                break;

                case 8:
                Percentage();
                break;

                case 9:
                Trigonometry();
                break;
                
                case 10:
                Logarithm(TakingInput());
                break;
                
                case 11:
                TemperatureConverter();
                break;

                default:
                System.out.println("Wrong choice try again!!!");

            }
            System.out.println("Wanna continue? Yes or No");
            ob.nextLine();
            String UC2 = ob.nextLine();
            ob.close();
            if(UC2.equalsIgnoreCase("Yes"))
            {
                flag = true;
            }
            else
            {
                flag = false;
                System.out.println("Thank you for using the calculator!!");
            }
        }while(flag == true);
        
    }

    static int TakingInput()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = ob.nextInt();
        ob.close();
        return input;
       
    }
    
}
