import java.util.Scanner;

public class Bank
{
    static Scanner input = new Scanner(System.in);
    private long ac_num;
    private String ac_name;
    private double Balance;

    public Bank()
    {
        ac_num=0;
        ac_name="";
        Balance = 0.0;
    }

    public  void getValues()
    {
        //Declaration of Scanner class
        
        System.out.println("Enter the bank account number");
        ac_num = input.nextLong();
        input.nextLine();//flushing away the enter key

        System.out.println("Enter the name of the owner of the account");
        ac_name = input.nextLine();

        System.out.println("Enter the Balance in the account");
        Balance = input.nextDouble();        
    }

    public  void Display()
    {
        System.out.println("The name of the account holder is "+ ac_name);
        System.out.println("The number of the account is " + ac_num);
        System.out.println("The Balance available is " + Balance);
    }

    public  void Deposit()
    {
        
        System.out.println("Enter the amount to be deposited ");
        Balance += input.nextDouble();        
    }
    
    public  void Withdrawal() 
    {
        
        System.out.println("Enter the amount to be withdrawn ");
        Balance -= input.nextDouble();        
    }

    public static void main(String[] args)
    {
        Bank obj = new Bank();
        obj.getValues();
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("Enter your choice");
        int uc = input.nextInt();

        switch(uc)
        {
            case 1:
            obj.Deposit();
            obj.Display();
            break;
            
            case 2:
            obj.Withdrawal();
            obj.Display();
            break;

            default:
            System.out.println("Wrong number entered please try again, Thank you!");
        }
    }

}
