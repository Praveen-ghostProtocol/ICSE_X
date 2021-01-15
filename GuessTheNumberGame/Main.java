package GuessTheNumberGame;
import java.util.*;
/**
 *Guess the number Game
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To the guessing Game");
        Scanner ob= new Scanner(System.in);
        GameLevel game = new GameLevel();
        int totalPrizeMoney = 0;
        game.SetLevel(1);
        displayMessage(game);
        while(true)
        {
            System.out.println("Enter the number");            
            int enteredNumber=ob.nextInt();
            if(enteredNumber == game.GetNumber())
            {
                totalPrizeMoney = totalPrizeMoney + game.GetPrizeMoney();
                System.out.println("Cracked it!!, You have won a prize money of:" + game.GetPrizeMoney());
                game.SetLevel(game.GetLevel() + 1);
                displayMessage(game);                
            }
            else if(enteredNumber > game.GetNumber())
            {
                System.out.println("Think lower");
                game.SetRemainingChances(game.GetRemainingChances() -1);
                System.out.println("You have " + game.GetRemainingChances() + " chance(s) to crack it!!!             ");
                System.out.println("Prize money for the chance has gone down to:  " + game.GetPrizeMoney() + "             ");
            }
            else if(enteredNumber < game.GetNumber())
            {
                System.out.println("Think higher");
                game.SetRemainingChances(game.GetRemainingChances() -1);
                System.out.println("You have " + game.GetRemainingChances() + " chance(s) to crack it!!!             ");
                System.out.println("Prize money for the level has gone down to:  " + game.GetPrizeMoney() + "             ");
            }
            if(game.GetRemainingChances() == 1 && game.GetNumber()%2==0)
            {
                System.out.println("Here is a clue to make it easy.");
                System.out.println("The number is even.");
            }
            else if(game.GetRemainingChances() == 1 && game.GetNumber()%2==1)
            {
                System.out.println("Here is a clue to make it easy.");
                System.out.println("The number is odd.");
            }
            if(game.GetRemainingChances() == 0)
            {
                System.out.println("You have exhausted all your chances.\n You have earned:" + totalPrizeMoney);
                System.out.println("Thank you for playing the game.");
                break;
            }
        }
        System.exit(0);
        ob.close();
    }

    public static void displayMessage(GameLevel game) {
        System.out.println("*********************************************************************************");
        System.out.println("            You are currently playing level:  " + game.GetLevel() + "            ");        
        System.out.println("            You have " + game.GetRemainingChances() + " chances to crack it!!!   ");
        System.out.println("            Number is between " + game.GetLevelMinRangeValue() + " and " + game.GetLevelMaxRangeValue() );
        
        System.out.println("            -------------------------All the best-----------------------------   ");
        System.out.println("**********************************************************************************");
        System.out.println("Prize money for the chance is:  " + game.GetPrizeMoney() + "         ");
    }
}
