import java.util.Scanner;

class program14 {
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = "";
        int iAge = 0;
        float fMarks = 0.0f;

        scanner = new  Scanner(System.in);
        System.out.println("Enter your Name : ");
        sName = scanner.nextLine();

        System.out.println("Enter your Age : ");
        iAge = scanner.nextInt();

        System.out.println("Enter your Marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("welcome " +sName);
        System.out.println("age : " +iAge);
        System.out.println("marks : " +fMarks);
    }    
}
