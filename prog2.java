public class prog2 {
    public static void main(String args[])
    {
        // int n;
        int status = 1;
        int num = 3;
        int x = Integer.parseInt(args[0]);
        System.out.println("First "+x+" prime numbers are:");   
        System.out.println(2);
        for(int i=2;i<=x;)
        {
            for(int j=2;j<=Math.sqrt(num);j++)
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }         
    }
}
