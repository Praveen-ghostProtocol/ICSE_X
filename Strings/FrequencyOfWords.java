package Strings;
import java.util.Scanner;

/**
program to find the frequency of the words in a given string
 */
public class FrequencyOfWords
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = ob.nextLine().trim();
        input = input + " ";
        String word = "";
        String word2 = "";
        int cnt=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch== ' ')
            {
                cnt++;
            }
        }
        String words[]= new String[cnt];

        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch!= ' ')
            {
                word+= ch;
            }
            else
            {
                boolean flag = false;
                for(int j=0;j<cnt3;j++)
                {

                    if(words[j].equalsIgnoreCase(word))
                    {
                        flag = false;
                    }
                    else
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    words[cnt3]=word;
                    cnt3++;
                }
                word="";
            }
        }
        String words2[] = new String[cnt3];
        for(int i=0;i<cnt3;i++)
        {
            words2[i]=words[i];
        }

        for(int i=0;i<cnt3;i++)
        {
            cnt2=0;
            for(int j=0;j<input.length();j++)
            {
                char ch = input.charAt(j);
                if(ch!=' ')
                {
                    word2 += ch;
                }
                else
                {
                    if(words2[i].equalsIgnoreCase(word2))
                    {
                        cnt2++;
                    }
                    word2="";
                }
            }
            System.out.println(words2[i]+" occured "+cnt2+" times");
        }
        ob.close();
    }
}
