import java.util.Scanner;

class program11 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iNo1 = 0 ;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        } 
        iNo1 = scanner.nextInt();
        
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

class check
{
    static int type(Scanner scanner)
    {
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input..! Please Enter Digits Only.");
            scanner.close();
            return 1;
        }
        return 0;
    }
}

