package Series;



import java.util.*;
/**
Count the given numbers on your fingers and find the correct finger on which the number ends. 

The first number starts from the thumb, second on the index finger, third on the middle finger, fourth on the ring finger and fifth on the little finger.

Again six comes on the ring finger and so on.

Ex. Input: 17 Output: 1
 */
public class UseYourDigits
{
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        int counter=1,k=0,j=0;

        for(int i = 1; i <=n;i++)
        {
            if(counter>5)
            {
                if(j<1&&counter>5)
                {
                    for(int b=0;b<=1;b++)
                    {
                        counter-=2;
                        j++;
                    }
                }
                else
                {
                    counter--;
                }
            }
            else 
            {
                if(k<1&&counter<1)
                {
                    for(int b=0;b<=1;b++)
                    {
                        counter+=2;
                        k++;
                    }
                }
                else
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        ob.close();
    }
}
