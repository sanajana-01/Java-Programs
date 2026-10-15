import java.util.Scanner;

class program17 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iNo1 = 0, iNo2 = 0 ;
        boolean iAns = false;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
         iNo1 = scanner.nextInt();

        System.out.println("Enter the second value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
        iNo2 = scanner.nextInt();

        Value value = new Value();
        iAns = value.Minimum(iNo1, iNo2);

        if(iAns == true)
        {
            System.out.println("Minimum is : "+iNo1);
        }
        else
        {
            System.out.println("Minimum is : "+iNo2);
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

class Value
{
    boolean Minimum(int iNo1, int iNo2)
    {
        if(iNo1 < iNo2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
