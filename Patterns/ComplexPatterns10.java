package Patterns;



public class ComplexPatterns10
{
    public static void main()
    {
        // Declaration
        char ch;
        
        // Initialisation
        ch='A';
        
        for(int i = 1; i<=6; i++)
        {
            //loop to print left part
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            
            
            //loop to print left part
            for(int j = 1 ; j<=6-i; j++)
            {
                System.out.print(ch + " ");
            } 
            ch++;
            
            //Next row
            System.out.println();
        }
    }
}
