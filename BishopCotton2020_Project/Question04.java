import java.util.Scanner;

public class Question04 
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner input = new Scanner(System.in);
        int num=0;
        int remainder;
        String binaryNum = "";

        System.out.println("Please enter the number in the base 10 form");
        num = input.nextInt();

        //loop to convert decimal to binary
        while (num != 0)
        {
            remainder = num % 2;
            num /= 2;
            binaryNum = remainder + binaryNum;
        }

        System.out.println("The number in the binary form is "+ binaryNum);
        input.close();
    }
}
