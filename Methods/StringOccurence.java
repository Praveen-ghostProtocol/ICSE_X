package Methods;


import java.util.Scanner;
public class StringOccurence
{
    
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string ");
        String S = ob.nextLine();
        int highestFrequncy = 0;
        char highestChar = 'e';

        for(char ch =32;ch<=127;ch++)
        {
            int frequency=0;
            for(int i =0;i<S.length();i++)
            {
                char j = S.charAt(i);
                if(ch==j)
                {
                    frequency++;
                }
            }

            if(frequency>highestFrequncy)
            {
                highestChar = ch;
            }
        }

        System.out.println("Character which appeared the most number of times is "+highestChar);
        ob.close();
    }
}
