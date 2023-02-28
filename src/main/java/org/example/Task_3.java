import java.util.Scanner;
public class Task_3  {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("Это полиндром");
        else
            System.out.println("Это не полиндром");
    }
}