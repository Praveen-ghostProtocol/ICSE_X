package loops;


import java.util.*;
public class Dummy
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = ob.nextLine();
        s = " " + s;
        int n = s.length();
        int digits = n * 2 - 1;
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= i - 1; j++)
            {
                System.out.print(s.charAt(j) + " ");
            }
            for (int j = 1; j <= digits; j++)
            {
                System.out.print(s.charAt(i) + " ");
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(s.charAt(j) + " ");
            }
            digits -= 2;
            System.out.println();
        }

        digits = 3;
        for (int i = n - 1; i > 0; i--)
        {
            for (int j = 1; j <= i - 1; j++)
            {
                System.out.print(s.charAt(j) + " ");
            }
            for (int j = 1; j <= digits; j++)
            {
                System.out.print(s.charAt(i) + " ");
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(s.charAt(j) + " ");
            }
            digits += 2;
            System.out.println();
        }
        ob.close();
    }
}