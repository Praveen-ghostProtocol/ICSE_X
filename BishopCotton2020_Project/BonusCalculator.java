import java.util.Scanner;

public class BonusCalculator 
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        String name ="";
        double bonus=0.0;
        double salary=0.0;
        char grade =' ';

        //taking values from the user
        System.out.println("Please enter your name");
        name = input.nextLine();

        System.out.println("Please enter your grade");
        grade = input.next().charAt(0);

        System.out.println("Please enter your basic annual salary");
        salary = input.nextDouble();

        switch(grade)
        {
            case 'A':
            case 'a':
            {
                bonus = (12.0/100.0)*salary;
                if(bonus>50000)
                {
                    bonus = 50000;
                }
                break;
            }
            case 'B':
            case 'b': 
            {
                bonus = (10.0 / 100.0) * salary;
                if (bonus > 40000) 
                {
                    bonus = 40000;
                }
                break;
            }
            case 'C':
            case 'c': 
            {
                bonus = (8.33 / 100.0) * salary;
                if (bonus > 30000)
                {
                    bonus = 30000;
                }
                break;
            }

            default:
            System.out.println("Wrong character entered, please try again. Thank You!!");
        }

        System.out.println("Welcome "+name+" !!");
        System.out.println("Your annual salaray is "+salary);
        System.out.println("Congratlations you have received a bonus of "+bonus);
        input.close();
    }
}
