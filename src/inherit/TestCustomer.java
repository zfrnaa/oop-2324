package inherit;

public class TestCustomer
{
    public static void main(String[] args)
    {
        Customer Cust1 = new Customer(124,134.50);
        PreferredCustomer CustVIP = new PreferredCustomer(133, 4123, 4.5);

        Cust1.display();
        CustVIP.display();
    }
}
