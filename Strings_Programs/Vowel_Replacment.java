package Strings_Programs;

import java.util.*;
/**
1. Write a program that alters a string in such a way that the alphabet next 
to a vowel gets replaced by an equivalent opposite case alphabet.
 */
public class Vowel_Replacment
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        String S;

        //prompt and accept the string from the user
        System.out.println("Enter a String");
        S=ob.nextLine();

        //declare and initialise an array of characters
        char ch[] = new char[S.length()];

        //Convert the string to an array of characters
        for(int i =0;i<S.length();i++)
        {
            ch[i]=S.charAt(i);
        }

        for(int i=0;i<ch.length;i++)
        {

            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                ch[i+1]=Character.toUpperCase(ch[i+1]);
            }
        }
        
        //Display the original string
        System.out.println(S);
        
        //dispaly resultant string
        for(int i =0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
        ob.close();
    }
}
