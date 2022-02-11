import java.util.Scanner;
public class prog13 {
     
    public static void main(String[] args) {
        int n=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int number: ");
        n = scn.nextInt();

        if(n <= 0)
            System.out.println("Enter a number greater than zero");
        else    
        {
            System.out.println("\n"+n+" in words: ");
            prog13 obj = new prog13();
            obj.pw((n/1000000000)," hunderd ");
            obj.pw((n/10000000)%100," crore ");
            obj.pw(((n/100000)%100)," lakh ");
            obj.pw(((n/1000)%100)," thousand ");
            obj.pw(((n/100)%10)," hundred ");
            obj.pw((n%100)," ");
        }
    }

    public void pw(int n, String ch)
    {
        String one[] = {"","one","two","three","four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",};

        String ten[] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        if(n > 19)
            System.out.print(ten[n/10]+" "+one[n%10]);
        else    
            System.out.print(one[n]);
        if(n > 0)
            System.out.print(ch);
    }   
}
