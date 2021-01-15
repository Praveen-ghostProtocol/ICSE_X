package Arrays;


import java.util.Scanner;
/**
Program to accept n student names from user and store it in an array.
Create p teams in such a way that p is square root of n.
Each team should have either p or p+1 members only.
Display the members of each team along with team number.
 */
public class Challenge01
{
    public Challenge01()
    {
        //this method is empty because i want it to be empty and the computer is telling me to do 
    }
    public static void main()
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        int n;
        int p;
        int pNo;
        int pPlus1No;
        
        //Prompt and accept the value of n
        System.out.println("Enter the value of n :");
        n = input.nextInt();
        input.nextLine();
        //Declare an array of length n
        String[] names = new String[n];
        
        //Initialization
        p = (int)Math.sqrt(n);
        
        //Accepting n names from the user
        System.out.println("Enter " + n + " names:");
        for (int i = 0;  i < names.length; i++)
        {
            names[i] = input.nextLine();
        }
        
        //Computation
        //Calculate the number of teams with p members and p+1 students
        pPlus1No = n % p;
        pNo = p - pPlus1No;
        
        //Create arrays
        String pNum[][] = new String[pNo][p];
        String p1Num[][] = new String[pPlus1No][p+1];
        
        //Assigning the students to the teams with p students
        int k = 0;
        for (int i = 0; i < pNo; i++)
        {
            for (int j = 0; j < p; j ++)
            {
                pNum[i][j] = names[k];
                k++;
            }
        }
        
        //Assigning he students to the teams with p+1 students
        for (int i = 0; i < pPlus1No; i++)
        {
            for (int j = 0; j < p+1; j++)
            {
                p1Num[i][j] = names[k];
                k++;
            }
        }
        
        //Display the teams with the team number
        int teamNo = 1;
        for (int i = 0; i < pNo; i++)
        {
            System.out.println("TEAM#" + teamNo);
            for (int j = 0; j < pNum[i].length; j++)
            {
                System.out.println(pNum[i][j]);
            }
            System.out.println();
            teamNo++;
        }
        
        for (int i = 0; i < pPlus1No; i++)
        {
            System.out.println("TEAM#" + teamNo);
            for (int j = 0; j < p1Num[i].length; j++)
            {
                System.out.println(p1Num[i][j]);
            }
            System.out.println();
            teamNo++;
        }
        input.close();
    }
}
