package Strings;

import java.util.*;
public class VowelReplacer
{
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        boolean userchoice=true;
        VowelReplacer obj = new VowelReplacer();
        while(userchoice)
        {
            System.out.println("Enter a word");
            String input = ob.next().trim().toLowerCase();                
            System.out.println(obj.Replacing(input));
            System.out.println("Want to work more?");
            String yesOrNo = ob.next().toUpperCase();
            if(yesOrNo.equalsIgnoreCase("NO"))
            {
                userchoice=false;
            }
        }
        
        ob.close();
    }

    public String Replacing(String str)
    {
        String word="";
        
        char ch;
        for(int i =0;i<str.length();i++)
        {            
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                ch+=1;
            }
            word+=ch;
        }
        return word;
    }
}
