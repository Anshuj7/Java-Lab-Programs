abstract class Vehicle
{
    public abstract void dreamCar();
}
class car_43 extends Vehicle
{
    public void dreamCar()
    {
        System.out.println("Tesla Model 3");
    }
    public static void main(String args[])
    {
    Vehicle v = new car_43();
    v.dreamCar();    
    }
}
