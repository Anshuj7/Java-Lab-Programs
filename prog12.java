import java.util.Scanner;
public class prog12 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int num, reversed = 0;
        System.out.println("Enter a random number");
        num = scn.nextInt();    
        System.out.println("Original Number: " + num);
        while(num != 0) 
        {
          int digit = num % 10;
          reversed = reversed * 10 + digit;
          num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
      }
}
