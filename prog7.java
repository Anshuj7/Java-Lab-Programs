public class prog7 {
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        if(n % 2 == 0)
            System.out.println("The given number "+n+" is Even ");
        else
            System.out.println("The given number "+n+" is Odd ");
    }
}
