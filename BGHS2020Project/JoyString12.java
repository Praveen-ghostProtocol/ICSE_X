import java.util.*;
public class JoyString12 
{
    public static void JoyString(String S,char ch1,char ch2)
    {
        String S1= S.replace(ch1,ch2);
        System.out.println(S1);
    }
    public static void JoyString(String S)
    {
        int firstSpace=0;
        int LastSpace=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            {
                firstSpace = i;
                break;
            }
        }
        for(int i=S.length()-1;i>=0;i--)
        {
            if(S.charAt(i)==' ')
            {
                LastSpace = i;
                break;
            }
        }
        System.out.println("The first time where space occurs is at index "+firstSpace);
        System.out.println("The last time where space occurs is at index "+LastSpace);
    }
    public static void JoyString(String S1,String S2)
    {
        String S3 =  S1+S2;
        System.out.println(S3);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Replacer");
        System.out.println("2.Space indexer");
        System.out.println("3.Concatenator");
        System.out.println("Please enter your choice");
        int uc = input.nextInt();

        switch(uc)
        {
            case 1:
            System.out.println("Enter a string");
            input.nextLine();
            String S= input.nextLine();
            System.out.println("Enter the character to replace");
            char ch1 = input.next().charAt(0);
            System.out.println("Enter the character to be replaced");
            char ch2 = input.next().charAt(0);
            JoyString(S,ch1,ch2);
            break;

            case 2:
            System.out.println("Enter a string");
            String S1= input.nextLine();
            JoyString(S1);
            break;

            case 3:
            System.out.println("Enter first string");
            String S2= input.nextLine();
            System.out.println("Enter second string");
            String S3= input.nextLine();
            JoyString(S2, S3);
            break;

            default: 
            System.out.println("Wrong number entered, please try again. Thank You.");
        }
        input.close();
    }
}
