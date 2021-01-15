import java.util.Scanner;

class Capitalize
 { 
    static String sent;
    static String cap;
    static int size;
    public Capitalize()
    {
        sent="";
        cap="";
        size=0;
    }
    public static void readsentence()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        sent = input.nextLine();
        size = sent.length();
        input.close();
    }
    public static String capfirstlast() 
    { 
        // Create an equivalent char array 
        // of given string 
        char[] ch = sent.toCharArray(); 
        for (int i = 0; i < ch.length; i++)
        { 
            int k = i; 
            while (i < ch.length && ch[i] != ' ') 
            {
                i++; 
            }
            // Check if the character is a small letter 
            // If yes, then Capitalise 
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'? ((int)ch[k] - 32)  : (int)ch[k]); 
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z' ? ((int)ch[i - 1] - 32)  : (int)ch[i - 1]); 
        } 
        String rev = new String(ch);
        cap = rev;
        return rev;
    } 
    public  void display()
    {
        System.out.println("The original string : "+sent);
        System.out.println("The changed string : "+cap);
    }
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Capitalize obj = new Capitalize();
        readsentence();
        capfirstlast();
        obj.display();
    } 
} 