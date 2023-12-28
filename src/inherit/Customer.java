package inherit;

public class Customer
{
    private int idNumber;
    private double balanceOwed;

    //constructor
    public Customer(int id, double bal)
    {
        idNumber = id;
        balanceOwed = bal;
    }

    public void display()
    {
        System.out.println("Customer id = " + idNumber + ", balance Owed = " + balanceOwed);
    }
}
