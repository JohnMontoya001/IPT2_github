import java.util.Scanner;
public class add{

    public static void main (String [] args)
    {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second number: ");
        num2 = input.nextInt();
        
        int ans = num1 + num2;

        System.out.println("Your answer is: " + ans );
    }
}
