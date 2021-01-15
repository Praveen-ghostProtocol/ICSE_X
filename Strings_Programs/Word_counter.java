package Strings_Programs;

//package Strings_Programs;

import java.util.*;
/**
 * 
 * program to count the number of words in the given string
1.Define a string.

3.Split the string into words.
4.Two loops will be used to find duplicate words. Outer loop will select a word and Initialize variable count to 1. Inner loop will compare the word selected by outer loop with rest of the words.
5.If a match found, then increment the count by 1 and set the duplicates of word to '0' to avoid counting it again.
6.After the inner loop, if count of a word is greater than 1 which signifies that the word has duplicates in the string.
 */
public class Word_counter
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        String S;
        int n=0;

        //prompt and accept string from the user
        System.out.println("Enter a string");
        S = ob.nextLine().trim();

        //finding the number of spaces in the array 
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch==' ')
            {
                n++;
            }
        }

        //declaring an array of words and counters
        String words[] = new String[n+1];
        String unique[]= new String[n+1];
        int counter[] = new int[n+1];

        String word = "";
        int k =0;
        //conver the given string into an array of words
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                words[k]=word;
                k++;
                word="";
            }
            if(i==S.length()-1)
            {
                words[k] = word;
            }
        }

        for(int i=0;i<words.length;i++)
        {
            boolean found = false;
            for(int l=0;l<unique.length;l++)
            {
                if(words[i].equalsIgnoreCase(unique[l]))
                {
                    counter[l]++;
                    found = true;
                    break;
                }

            }
            if(!found)
            {
                for(int l=0;i<unique.length;l++)
                {
                    if(unique[l]==null)
                    {
                        unique[l]=words[i];
                        counter[l]=1;
                        break;
                    }

                }
            }
        }

        //display original string
        System.out.println(S);

        //Display array with frequency
        System.out.println("word \t frequency");
        for(int i =0;i<unique.length;i++)
        {
            if(unique[i]==null)
            {
                break;
            }

            System.out.println(unique[i]+"\t"+counter[i]);
        }
        ob.close();
    }
}
