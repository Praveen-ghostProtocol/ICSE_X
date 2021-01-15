import java.util.Scanner;

public class HappyString7
{
    private static boolean isHappyNumber(long num) {
        long sum = 0;
        long n = num;
        do {
            sum = 0;
            while (n != 0) {
                int d = (int)(n % 10);
                sum += d * d;
                n /= 10;
            }
            n = sum;
        } while (sum > 6);
        
        return (sum == 1);
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        word = word.toUpperCase();
        String wordValueStr = "";
        int len = word.length();
        
        for (int i = 0; i < len; i++) {
            wordValueStr += String.valueOf(word.charAt(i) - 64); 
        }
        
        long wordValue = Long.parseLong(wordValueStr);
        boolean isHappy = isHappyNumber(wordValue);
        
        if (isHappy)
        {
            System.out.println("A Happy Word");
        }
        else
        {
            System.out.println("Not a Happy Word");
        }
        input.close();
    }
}