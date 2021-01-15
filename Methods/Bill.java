package Methods;



/**Define a class Bill that calculates the telephone bill of a consumer with the following 

description: 


Instance variables/data members: 

int bno : bill number 

String name : name of consumer 

int call : no. of calls consumed in a month 

double amt : bill amount to be paid by the person 


Methods/Member functions: 

Bill()  

constructor to initialize data members with default initial value 

Bill(...)  

parameterised constructor to accept billno, name and no. of calls 


Calculate() : to calculate the monthly telephone bill for a consumer as per the 

following condition 

Units consumed Rate 

First 100 calls  0.60/call 

Next 100 calls   0.80/call 

Next 100 calls   1.20/call 

Above 300 calls  1.50/call 


Fixed monthly rental applicable to all consumers : Rs.125 

Display() : to display the details 

Create an object in the main() method and invoke the above functions to perform the 

desired task. 

 */ 


import java.util.*; 

class Bill{ 

    int bno; // bill number 

    String name; 

    int call; //no. of calls made 

    double amt; 


    public Bill() 

    {System.out.println("Default constructor called"); 

        bno=0; 

        name=""; 

        call=0; 

        amt=0.0D; 

    } 


    Bill(int num,String nm,int c) 

    {System.out.println("Parameterized constructor called"); 

        bno=num; 

        name=nm; 

        call=c; 

    } 


    void calculate() 

    {if(call<=100) 

            amt=0.60*call; 

        else if(call>100 && call<=200) 

            amt=(0.60 * 100)+ (call-100)*0.80; 

        else if(call>200 && call<=300) 

            amt=(0.60 * 100)+ (0.80*100)+(call-200)*1.20; 

        else if(call>300) 

            amt=(0.60 * 100)+ (0.80*100)+(100*1.20)+(call-300)*1.50; 

        amt+=125; //RS.125 RENT IS APPLICABLE TO ALL CUSTOMERS 

    } 


    void display() 

    { 

        System.out.println("Bill No. : "+bno); 

        System.out.println("Name : "+name); 

        System.out.println("No. of calls: "+call); 

        System.out.println("+ Rent Rs.125"); 

        System.out.println("Total Amount: "+amt); 

    } 


    static void main() 

    {Scanner ob=new Scanner(System.in); 

        //Bill b1=new Bill(); //Invoke default constructor 

        int a;
        int c; 

        String b; 



        System.out.println("Enter the Bill number"); 

        a=ob.nextInt(); 

        System.out.println("Enter the Customer name"); 

        b=ob.nextLine(); 

        ob.nextLine(); //to eliminate nextLine()issues 

        System.out.println("Enter the No.Of.Calls made"); 

        c=ob.nextInt(); 


        Bill b2=new Bill(a,b,c); //Invoke parameterized constructor 

        b2.calculate(); 

        b2.display(); 
        ob.close();
    }
} 