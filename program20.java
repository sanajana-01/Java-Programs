import java.util.Scanner;

class program17 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        int iNo1 = 0, iNo2 = 0,iNo3 = 0, iAns = 0;
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

        System.out.println("Enter the third value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
        iNo3 = scanner.nextInt();

        Value value = new Value();
        iAns = value.Maximum(iNo1, iNo2, iNo3);
        System.out.println("Maximum is : "+iAns);
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
    int Maximum(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 > iNo2 && iNo1 > iNo3)
        {
            return iNo1;
        }
        else if(iNo2 > iNo1 && iNo2 > iNo3)
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}
