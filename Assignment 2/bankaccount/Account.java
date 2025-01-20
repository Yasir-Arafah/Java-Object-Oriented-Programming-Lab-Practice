
package bankaccount;


public class Account 
{
    public int accountID;
    public double balance;
    public String transactionType;
    
    
    public Account()
    {
        accountID = 0;
        balance = -1.0;
        transactionType = "null";
    }
    
    public Account(int m, double y, String z)
    {
        accountID = m;
        balance = y;
        transactionType = z;
    }    
    
    
    public double changeBalance(double x)
    {
        if (transactionType == "debit")
                return (balance - x);
        else (transactionType == "credit")
                return (balance + x);
    }
}
