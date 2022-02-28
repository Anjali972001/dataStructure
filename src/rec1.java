import java.util.Scanner;

public class rec1 {
    public static void printNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        printNumber(n);
    }
}
