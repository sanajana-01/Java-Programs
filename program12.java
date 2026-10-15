import java.util.Scanner;

class program10 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iNo1 = 0, iNo2 = 0, iAns = 0 ;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
        iNo1 = scanner.nextInt();

        EvenOdd eo = new EvenOdd();
        eo.type(iNo1);
        // System.out.println("Addition is : " + iAns);
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
    void type(int iNo1)
    {
        if(iNo1 % 2 == 0)
        {
            System.out.println("Entered no is " + iNo1 + " is a Even.");
        }
        else
        {
            System.out.println("Entered no is " + iNo1 + " is a Odd.");
        }
    }
}
