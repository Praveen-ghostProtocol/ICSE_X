package Strings_Programs;

import java.util.*; 
/**
WAP to accept the name of n states and their population and store it in two arrays.
Sort them using selection sort(in alphabetical order of their states).
Also accept a name of state from user and display the population of that state (using binary search)
 */
public class State_Searcher
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner ob = new Scanner(System.in);

        //Prompt and accept the stated from the user
        System.out.println("Enter the number of states");
        int n = ob.nextInt();
        ob.nextLine();
        String states[] = new String[n];//Declaring an array of Strings
        long popl[] = new long[n];//Declaring an array of intergers

        System.out.println("Enter the name and population of each state");
        for(int i=0;i<n;i++)
        {
            states[i]=ob.nextLine();
            popl[i]=ob.nextInt();
            ob.nextLine();
        }

        //selection sorting both arrays
        for(int i=0;i<n-1;i++)
        {
            int ios = i;
            for (int j = i + 1; j < n; j++) {
                if (states[j].compareTo(states[i]) < 0) {
                    ios = j;
                }
            }

            //Swap
            String tempS = states[ios];
            long temp_p = popl[ios];
            states[ios]=states[i];
            states[i]=tempS;
            popl[ios]=popl[i];
            popl[i]=temp_p;
        }

        //Print the resultant order
        System.out.println("States\t population");
        for(int i =0;i<n;i++)
        {
            System.out.println(states[i] +"\t"+popl[i]);
        }

        //Binary search
        System.out.println("Enter the name of the state to be searched");
        String key = ob.nextLine();

        //Declaring and initialising all vars required for binary search
        int low=0;
        int high=states.length;
        int pos=0;
        int mid=0;

        boolean flag = false;

        while(low<=high)
        {
            mid = (low+high)/2;

            if(key.equalsIgnoreCase(states[mid]))
            {
                pos = mid;
                flag = true;
                break;
            }
            else if(key.compareTo(states[mid])<0)
            {
                high = mid-1;
            }
            else if(key.compareTo(states[mid])>0)
            {
                low = mid+1;
            }
        }

        if(flag)
        {
            System.out.println("The population of "+key+" is "+popl[pos]);
        }
        else
        {
            System.out.println(key +" not found !!");
        }
        ob.close();
    }
}
