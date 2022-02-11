public class prog5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        System.out.println("N1: "+a+" and N2: "+b);
        System.out.println("\nAddition: "+add);
        System.out.println("\nSubtraction: "+sub);
        System.out.println("\nMultiplication: "+mul);
        System.out.println("\nDivision: "+div);
        System.out.println("\nModulus: "+mod);

    }
}
