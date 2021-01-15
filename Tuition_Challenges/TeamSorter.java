package Tuition_Challenges;


import java.util.*;
/**
Program to accept n student names from user and store it in an array.
Create p teams in such a way that p is square root of n.
Each team should have either p or p+1 members only.
Display the members of each team along with team number.
 */
public class TeamSorter
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner ob = new Scanner(System.in);
        int n,p,k;
        int numberOfTeams,teamStrength,numberLeftOut;

        //take n
        System.out.println("Enter the number of students");
        n=ob.nextInt();
        ob.nextLine();
        //calculating p (number of teams)
        p=(int)Math.floor(Math.sqrt(n));
        
        //declaring an array to store names
        String[] arrOfNames = new String[n];
        //taking input of names and storing them in the array declared above
        System.out.println("Enter the name of "+n+" students");
        for(int i=0;i<n;i++)
        {
            String S= ob.nextLine();
            arrOfNames[i] = S;
        }
        
        //initialisation
        numberOfTeams = p ;// storing p into numberOfTeams to avoid confusion
        teamStrength = n/p;// to calculate the minimum number of students to be placed in each team
        numberLeftOut = n%p;
        
        //creating a 2D array to store the names into various teams
        String[][] teams = new String[numberOfTeams][teamStrength+1];//using teamsStrength+1 to accomadate for the left out students to be added
        //loop to sort students into teams
        k=0;
        //first loop to sort students into teams with equal members
        for(int i=0;i<numberOfTeams;i++)
        {
            for(int j =0;j<teamStrength;j++,k++)//using k to run through all the names of the arrOfNames 
            {
                teams[i][j]= arrOfNames[k];
            }
        }
        //second loop to assign a team to the left out students in the first loop
        for(int i = 0; i<numberOfTeams;i++,numberLeftOut--)
        {
            if(numberLeftOut==0)
            {
                break;
            }
            else
            {
                teams[i][teamStrength]= arrOfNames[n-numberLeftOut];
            }
        }

        //display the 2D array only if there is a valid string to avoid NullPointerException
        for(int i =0;i<numberOfTeams;i++)
        {
            System.out.println("Team "+ (i+1));
            System.out.println("------");
            for(int j=0;j<teamStrength+1;j++)
            {
                
                if(teams[i][j] != null)
                {
                    System.out.println((j+1)+". "+teams[i][j]+ " "); // to display name of the student in the team with serial number
                }
            }
            System.out.println();// to shift lines for the next team
        }
        ob.close();
    }
}

