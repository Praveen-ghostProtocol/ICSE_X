package Strings_Programs;

import java.util.*;
/**
program to sort an array of strings on the basis of the number of vowels in each word
 */
public class Vowel_Sorting
{
    public static void main(String args[])
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        int n=0;

        //prompt and accept the string from the user
        System.out.println("Enter a String");
        String S = ob.nextLine().trim();

        //finding the number of spaces in the array 
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch==' ')
            {
                n++;
            }
        }

        //declare and array of words 
        String[] words = new String[n];
        int vowels[] = new int[n]; 

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

        }

        int w =0;
        //Counting the number of vowels in each word
        for(int i =0;i<words.length;i++)
        {
            w=0;
            for(int j =0;j<words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    w++;
                }

            }
            vowels[i]=w;
        }

        //bubble sort based on the vowels array
        int m = vowels.length;
        int temp = 0;
        String tempS="";
        for(int i=0;i<m-1;i++)
        {
            for(int j =0;j<m-i-1;j++)
            {
                if(vowels[j]>vowels[j+1])
                {
                    //Swap vowel array
                    temp = vowels[j];
                    vowels[j]=vowels[j+1];
                    vowels[j+1]=temp;
                    
                    //Swap String words array
                    tempS = words[j];
                    words[j]=words[j+1];
                    words[j+1]=tempS;
                }
            }
        }
        
        //Display the resultant String
        System.out.println("Words \t vowels");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+"\t"+vowels[i]);
        }
        ob.close();
    }
}
