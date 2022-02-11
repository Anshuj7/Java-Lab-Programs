// import java.util.Scanner;
public class prog3 
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j);
                for(int k=i-1;k>=1;k--)
                    System.out.print(k); 
                    System.out.print("\n");
        }
    }
}