package Strings_Programs;

import java.util.*;
/**
to check if the given 2 words are Anagrams or not.
 */
public class Anagrams
{
    public static void main(String args[])
    {
        //Declare
        Scanner ob = new Scanner(System.in);
        String s1,s2,r1,r2;
        char a1[],a2[];
        int ios;
        char smallest,temp1,temp2;
        boolean flag;
        

        //Get the Strings from the user
        System.out.println("Enter the first String");
        s1=ob.nextLine();
        System.out.println("Enter the second String");
        s2=ob.nextLine();

        //create 2 arrays
        a1= new char[s1.length()];
        a2= new char[s1.length()];
        r1="";
        r2="";

        //Convert to array
        for(int i =0;i<s1.length();i++)
        {
            a1[i]=s1.charAt(i);
        }
        for(int i =0;i<s2.length();i++)
        {
            a2[i]=s1.charAt(i);
        }

        if(s1.length()!=s2.length())
        {
            flag = false;
        }
        else
        {
            flag = true;
            for(int i = 0;i<s1.length()-1;i++)
            {
                smallest=a1[i];
                ios=i;
                
                for(int j=i+1;j<s1.length();j++)
                {
                    if(a1[j]<smallest)
                    {
                        smallest = a1[j];
                        ios=j;
                    }
                }
                
                //Swap
                temp1=a1[ios];
                a1[ios]=a1[i];
                a1[i]=temp1;
            }
            for(int i = 0;i<s2.length()-1;i++)
            {
                smallest=a2[i];
                ios=i;
                
                for(int j=i+1;j<s2.length();j++)
                {
                    if(a2[j]<smallest)
                    {
                        smallest = a2[j];
                        ios=j;
                    }
                }
                
                //Swap
                temp2=a2[ios];
                a2[ios]=a2[i];
                a2[i]=temp2;
            }

            //convert back to array
            for(int i =0;i<s1.length();i++)
            {
                r1+=a1[i];
            }
            for(int i =0;i<s2.length();i++)
            {
                r2+=a2[i];
            }
        }

        if(flag==false)
        {
            System.out.println("Given 2 Strings are not Anagrams");
        }
        else if(flag==true && r1.equalsIgnoreCase(r2))
        {
            System.out.println("Given 2 Strings are  Anagrams");
        }
        ob.close();
    }
}
