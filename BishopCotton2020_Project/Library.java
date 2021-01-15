import java.util.Scanner;

public class Library 
{
    int acc_num;
    String title;
    String name;
    int fine;
    Scanner input = new Scanner(System.in);

    public  void input()
    {
        System.out.println("Please enter the access number");
        acc_num = input.nextInt();
        input.nextLine();//flushing out the enter key

        System.out.println("Please enter the title of the book");
        title = input.nextLine();

        System.out.println("Please enter the name of the author");
        name = input.nextLine();
    }
    public void compute()
    {
        System.out.println("Please enter the number of days late");
        int dayslate = input.nextInt();
        fine = dayslate * 2;

        System.out.println("The fine to be paid is " + fine);
        
    }
    public void display() 
    {
        System.out.println("Accession number \t Title of book \t Name of author");
        System.out.println(acc_num+"\t"+title+"\t"+name);
    }

    public static void main(String[] args)
    {
        Library obj = new Library();

        obj.input();
        obj.compute();
        obj.display();
        
    }
    
}
