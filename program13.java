import java.util.Scanner;

class program13 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iNo1 = 0 ;
        boolean bool = false;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
        iNo1 = scanner.nextInt();

        EvenOdd eo = new EvenOdd();
        bool = eo.type(iNo1);

        if(bool == true)
        {
            System.out.println("Entered number " + iNo1 + " is a Even Number.");
        }
        else
        {
            System.out.println("Entered number " + iNo1 + " is a Odd Number.");
        }
    }
}

class check
{
    static int type(Scanner scanner)
    {
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input..! Please Enter Digits Only . ");
            scanner.close();
            return 1;
        }
        return 0;
    }
}

class EvenOdd
{
    boolean type(int iNo1)
    {
        if(iNo1 % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
