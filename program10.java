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

        System.out.println("Enter the second value : ");
        if( check.type(scanner) == 1)
        {
           return ;
        }
         iNo2 = scanner.nextInt();

        add a = new add();
        iAns = a.sum(iNo1, iNo2);
        System.out.println("Addition is : " + iAns);
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

class add
{
    int sum(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }
}