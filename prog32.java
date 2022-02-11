interface GrossSal{
    final int basic = 5000;
    public void ComputeSal(int d, int h);
}
interface NetSal{
    final int medical = 500;
    public void ProvFund(int d, int h, int p);
}
class prog32 implements GrossSal, NetSal{
    public void ComputeSal(int d, int h){
        System.out.println("Gross Salary is: "+(basic+medical+basic*(d+h)/100));
    }
    public void ProvFund(int d, int h, int p){
        System.out.println("Net Salary after deduction of pf is: "+(basic+medical+basic*(d+h-p)/100));
    }
    public static void main(String args[]){
        prog32 e = new prog32();
        e.ComputeSal(20,10);
        e.ProvFund(20,10,15);
    }
}