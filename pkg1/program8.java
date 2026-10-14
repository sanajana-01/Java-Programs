package pkg1;

import java.util.Scanner;

public class program8 {
    public static void main(String A[]) {
        Scanner scanner = null;
        // program7 p = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second value : ");
        iValue2 = scanner.nextInt();

        // p = new program7();
        iResult = program7.add(iValue1, iValue2);
        System.out.println("Addition is :" + iResult);
    }
}
