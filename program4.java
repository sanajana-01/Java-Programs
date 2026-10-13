import java.util.Scanner;

class program4
{
    public static void main (String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0,ia;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second value : ");
        iValue2 = scanner.nextInt();

        iResult = sum.add(iValue1, iValue2);
        System.out.println("Addition is :"+iResult);
    }
}

class sum
{
    static int add(int iNo1, int iNo2)
    {
        int iAns = 0;

        iAns = iNo1 + iNo2;
        return  iAns;
    }
}