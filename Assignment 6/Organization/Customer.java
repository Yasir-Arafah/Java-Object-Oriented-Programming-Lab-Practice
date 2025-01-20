package Organization;

public class Customer extends Person implements infoCustomer{
    public double mnySpnd;
    
    Customer()
    {
        
    }
    Customer(String name , int phnNmbr , String email, double mnySpnd ,String country)
    {
         super( name , phnNmbr ,email );
         this.mnySpnd = mnySpnd;
         this.country = country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public void totalMoneySpend()
    {
        System.out.println("Money Spent: " + mnySpnd);
    }
    void Print()
    {
        System.out.println("Name is: " + name);
        System.out.println("Phone Number is: " + phnNmbr);
        System.out.println("Email is: " + email);
        System.out.println("Country is: " + country);
        System.out.println("Money Spent: " + mnySpnd +"$\n");
       
    }
}
