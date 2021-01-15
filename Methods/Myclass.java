package Methods;



/*Design a class overloading a function calculate() as follows: 
i) void calculate(int m, char ch) with one integer argument and one character argument.  
It checks whether the integer argument is divisible by 7 or not, if ch is ‘s’.  
Otherwise it checks whether the last digit of the integer argument is 7 or not. 
  
ii) void calculate(int a, int b, char ch) with two integer arguments and one character argument.  
It displays the greater of integer arguments if ch is ‘g’. Otherwise it displays the smaller of integer arguments. 
 
Write a menu driven program to invoke one of the above functions as per the user's choice. 
 */ 
   
//Execute the sampleMethod 
import java.util.*; 
class Myclass 
{ 
    void calculate(int m, char ch) 
    { 
        if(ch=='s') 
        {if(m%7==0)    
                System.out.println("The number is divisible by 7"); 
            else                 
                System.out.println("The number is not divisible by 7"); 
        } 
        else   
        {if(m%10==7)  
                System.out.println("The last digit of the number is 7"); 
            else                 
                System.out.println("The last digit of the number is not 7"); 
        }} 
     
    void calculate(int a, int b, char ch) 
    { 
        if(ch=='g')    System.out.println("The greater number is "+Math.max(a,b)); 
        else              System.out.println("The smaller number is "+Math.min(a,b)); 
    } 
        
    public static void sampleMethod() 
    { 
        Myclass   mm=new Myclass(); 
        Scanner ob=new Scanner(System.in); 
        char ch; 
        System.out.println("MENU"); 
        System.out.println("1. Find if the number is divisible by 7 [or] if the last digit is 7"); 
        System.out.println("2. Print the greater or the smaller value"); 
        System.out.println("Enter your choice 1 or 2"); 
        switch(ob.nextInt()) 
        { 
            case 1: System.out.println("Enter the two numbers"); 
            System.out.println("Enter the character 'g' to find the greater value ...any other character for smaller value"); 
            ch=ob.next().charAt(0);     
            mm.calculate(ob.nextInt(),ob.nextInt(),ch);      //Method Call …..int,int,char 
            break; 
  
            case 2: System.out.println("\n\nEnter a number"); 
            System.out.println("Enter 's' for divisibility by 7(or)any char for last digit 7"); 
            ch=ob.next().charAt(0);                                                           
            mm.calculate(ob.nextInt(),ch);               //Method Call ...int,char    
            break; 
         
            default: System.out.println("Invalid input"); 
        }
        ob.close();
    }
} 