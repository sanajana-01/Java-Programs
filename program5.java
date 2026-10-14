import java.util.Scanner;

class program5 {
    public static void main(String A[]) {
        
        Scanner scanner = null;
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
        }
        iNo1 = scanner.nextInt();

        System.out.println("Enter the second value : ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
        }
        iNo2 = scanner.nextInt();

        add a = new add();
        iAns = a.sum(iNo1, iNo2);
        System.out.println("Addition is : " + iAns);
    }
}

class add
{
    int sum(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }
}