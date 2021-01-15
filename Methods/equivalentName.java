package Methods;



/**
 print the number given in words
 */
public class equivalentName
{
    public static void main(int n)
    {
        
        int RN= n%10;
        int LN = n/10;
        
        switch(LN)
        {
            case 1:
            System.out.print("one "); break;
            case 2:
            System.out.print("two "); break;
            case 3:
            System.out.print("three "); break;
            case 4:
            System.out.print("four "); break;
            case 5:
            System.out.print("five "); break;
            case 6:
            System.out.print("six "); break;
            case 7:
            System.out.print("seven "); break;
            case 8:
            System.out.print("eight "); break;
            case 9:
            System.out.print("nine "); break;
            case 0:
            System.out.print("zero ");break;
            
            default: System.out.println("hahaha");
            
        }
        switch(RN)
        {
            case 1:
            System.out.print("one "); break;
            case 2:
            System.out.print("two "); break;
            case 3:
            System.out.print("three "); break;
            case 4:
            System.out.print("four "); break;
            case 5:
            System.out.print("five "); break;
            case 6:
            System.out.print("six "); break;
            case 7:
            System.out.print("seven "); break;
            case 8:
            System.out.print("eight "); break;
            case 9:
            System.out.print("nine "); break;
            case 0:
            System.out.print("zero ");break;
            default: System.out.println("hahaha");
            
        }
    }
}
