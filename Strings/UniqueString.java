package Strings;

import java.util.*;
public class UniqueString
{
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = ob.next().trim().toUpperCase();    
        boolean userchoice=true;
        UniqueString obj = new UniqueString();
        while(userchoice)
        {
            obj.Unique(input);
            System.out.println("Want to check more?");
            String yesOrNo = ob.next();
            if(yesOrNo.equalsIgnoreCase(yesOrNo))
            {
                userchoice=false;
            }
        }
        ob.close();
    }

    public String Unique(String str)
    {
        int count=0;
        boolean flag = true;
        char ch;
        for(int i =65;i<=90;i++)
        {
            count=0;
            ch=(char)i;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>1)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            return "Unique String";
        }
        else
        {
            return "Not Unique String";
        }
    }
}
