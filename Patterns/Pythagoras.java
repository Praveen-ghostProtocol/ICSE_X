package Patterns;


import java.util.Scanner;

public class Pythagoras
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        char ch = ob.next().charAt(0);
        for(int row=1;row<=n;row++)
        {
            if(row==1)
            {
                for(int k=1;k<=n;k++)
                {
                    System.out.print(ch);
                }
            }
            else
            {
                for(int col1 = 1;col1<row;col1++)
                {
                    System.out.print(" ");
                }
                for(int col=n;col>=1;col--)
                {
                    if(col==n)
                    {
                        System.out.print(ch);
                    }
                    else if(col!=row)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(ch);
                    }
                }
            }
            System.out.println();
        }
        ob.close();
    }
    
}
