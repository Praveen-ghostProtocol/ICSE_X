import java.util.Scanner;

public class Question02
 {
    public static void main(String[] args)
    {
        // Declaration
        Scanner input = new Scanner(System.in);
        int n;

        //taking the number as input from the user
        System.out.println("Enter the number");
        n=input.nextInt();
        
        //running loop from 1 to 9 to print the numbers in the ascending order
        for (int i = 1; i <= 9; i++)
        {
            int cnt = 0;
            int num = n;
            while (num != 0) 
            {
                if (num % 10 == i)
                {
                    cnt++;
                    break;
                }
                num /= 10;
            }
            if (cnt >= 1)
            {
                System.out.print(i + ",");
            }

        }
        input.close();
    }
    
}

