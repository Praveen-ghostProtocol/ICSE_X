

public class TriangleCalculator
{
    static int longest;
    static int base;

    public TriangleCalculator()
    {
        longest = 6;
        base =4;
    }
    public double Other_sideCalc()
    {
        return Math.sqrt((longest * longest * 1.0) - (base * base * 1.0));
    }

    public static void main(String[] args)
    {
        TriangleCalculator obj = new TriangleCalculator();
        System.out.println("The length of the other side is "+obj.Other_sideCalc());
        
    }
}
