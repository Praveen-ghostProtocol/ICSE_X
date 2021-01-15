package Strings;
import java.util.Scanner;
/**
input : FOOTBALL IS A GOOD GAME
OUTPUT : FOOTBALLLABTOOF ISI A GOODOOG GAMEMAG
 */
public class Reverser
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String Input = ob.nextLine();
        Input = Input+" ";
        String word="";
        String rev="";
        for(int i =0;i<Input.length();i++)
        {
            char ch = Input.charAt(i);
            if(ch!= ' ')
            {
                word = word+ch;
                rev = ch+rev;
            }
            else
            {
                System.out.print(word+""+rev.substring(1)+" ");
                word="";
                rev="";
            }
        }
        ob.close();
    }
}
