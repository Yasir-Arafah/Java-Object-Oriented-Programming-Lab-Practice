
package bankaccount;

public class BankAccount 
{

    public static void main(String[] args) 
    {
        Account value = new Account(1001, 5000, "debit");
        
                System.out.println("Account ID is :" + value.accountID);
                System.out.println("Original Balance is :" + value.balance);
                System.out.println("Transaction Type :" + value.transactionType);
                System.out.println("Changed Balance :" + value.changeBalance(50));
        
    }
    
}
