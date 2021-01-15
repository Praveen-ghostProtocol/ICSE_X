
import java.util.Scanner;

public class SamplePaper01_Q8 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String S = input.nextLine().trim();
        S = S + " ";
        System.out.println("Enter the key to be searched");
        String key = input.next();
        String word="";
        int cnt=0;

        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!= ' ')
            {
                word += S.charAt(i);
            }
            else
            {
                if(key.equalsIgnoreCase(word))
                {
                    cnt++;
                }
                word="";
            }
        }
        System.out.println(key+ " occured in the "+cnt+" number of times");
        input.close();
    }
    
}
