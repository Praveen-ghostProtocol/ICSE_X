package Strings;
import java.util.*;


/**
to check whether the given 2 Strings are the rotation of the other
eg: waterbottle and erbottlewat are the rotations of each other
 */
public class RotationChecker
{
    public static void main(String S1,String S2)
    {
        boolean flag = true;
        char ch1[] = new char[S1.length()];
        char ch2[] = new char[S2.length()];
        if(S1.length()!= S2.length())
        {
            System.out.println("The entered words are not in rotation");
            flag = false;
            System.exit(0);
            return;
        }
        for(int i=0;i<S1.length();i++)
        {
            ch1[i]=S1.charAt(i);
        }
        for(int i=0;i<S2.length();i++)
        {
            ch2[i]=S2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String result = S1+S1;
        if(Arrays.equals(ch1,ch2))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(result.indexOf(S2) != -1)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("The entered words are in rotation");
        }
        else
        {
            System.out.println("The entered words are not in rotation");
        }
    }
}
