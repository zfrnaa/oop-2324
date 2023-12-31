package inherit;

public class PreferredCustomer extends Customer
{
    private double discountRate;

    public PreferredCustomer(int id, double bal, double rate){
        super(id, bal);
        discountRate = rate;
    }

    public void display(){
        super.display();
        System.out.println("Discount rate is " + discountRate);
    }
}
