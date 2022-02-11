import java.util.Scanner;
public class prog15 {
    public static void main(String[] args) 
    {
        int m, n, p, q, sum = 0, c, d, k;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers of rows and columns of first matrix");
        m = scn.nextInt();
        n = scn.nextInt();
        int first[][] = new int[m][n];
        System.out.println("Enter elements of first matrix: ");
        for(c=0; c<m; c++)
            for(d=0; d<n; d++)
                first[c][d] = scn.nextInt();

        System.out.println("Enter numbers of rows and columns of second matrix");
        p = scn.nextInt();
        q = scn.nextInt();

        if(n != p)
            System.out.println("Matrices with entered order can't be multiplied!");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];
            System.out.println("Enter the elements of second matrix");
            for(c=0; c<p; c++)
                for(d=0; d<q; d++)
                    second[c][d] = scn.nextInt();

            for(c=0; c<m; c++)
            {
                for(d=0; d<q; d++)
                {
                    for(k=0; k<p; k++)
                    {
                        sum = sum + first[c][k] * second[k][d];
                    }
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of entered matrices: ");
            for(c=0; c<m; c++)
            {
                for(d=0; d<q; d++)
                    System.out.print(multiply[c][d]+"\t"+"\n");
            }
        }
    }
}
