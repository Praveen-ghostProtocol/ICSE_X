package GuessTheNumberGame;

/**
 * 
 * Class to perform calculations and 
 * store entered numbers.
 */
public class GameLevel
{
    private int randomNumberMultiplier = 10;
    private int level;
    public int GetLevel() { return level; }
    public void SetLevel(int level) { 
        this.level = level; 
        this.SetRemainingChances(level + 1);
        this.SetPrizeMoney(level * this.GetRemainingChances() * 1000);
        this.SetLevelMinRangeValue(level);
        this.SetLevelMaxRangeValue(level * 6);
        this.randomNumberMultiplier = (int) Math.pow(10, this.level);
        this.SetNumber();
    }

    private int remainingChances;
    public int GetRemainingChances() { return remainingChances; }
    public void SetRemainingChances(int remainingChances) { 
        this.remainingChances = remainingChances; 
        this.SetPrizeMoney(level * this.GetRemainingChances() * 1000);
    }

    private int number;
    public int GetNumber() { return number; }
    public void SetNumber() { 
        int tempRandomNumber = 0;
        while(true)
        {
            tempRandomNumber = (int)(Math.random() * randomNumberMultiplier);
            
            if(tempRandomNumber > 0 && tempRandomNumber < this.levelMaxRangeValue)
            {
                
                break;
            }
        }
        
        this.number = tempRandomNumber;
    }

    private int prizeMoney;
    public int GetPrizeMoney() { return prizeMoney; }
    public void SetPrizeMoney(int prizeMoney) { this.prizeMoney = prizeMoney; }

    private int levelMinRangeValue;
    public int GetLevelMinRangeValue() 
    {
        return levelMinRangeValue;
    }
    public void SetLevelMinRangeValue(int levelMinRangeValue) 
    {
        this.levelMinRangeValue = levelMinRangeValue;
    }

    private int levelMaxRangeValue;
    public int GetLevelMaxRangeValue() 
    {
        return levelMaxRangeValue;
    }
    public void SetLevelMaxRangeValue(int levelMaxRangeValue) 
    {
        this.levelMaxRangeValue = levelMaxRangeValue;
    }
}
