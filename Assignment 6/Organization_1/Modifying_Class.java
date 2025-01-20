
package Organization;


public class Modifying_Class extends Customer{
    public double salary;
    public String dept;
    
    Modifying_Class()
    {
        
    }
    Modifying_Class(String name , int phnNmbr , String email, double mnySpnd ,String country, double salary, String dept)
    {
         super(name , phnNmbr ,email, mnySpnd, country);
         this.salary = salary;
         this.dept = dept;
    }

    void Print()
    {
        System.out.println("Name is: " + name);
        System.out.println("Phone Number is: " + phnNmbr);
        System.out.println("Email is: " + email);
        System.out.println("Money Spent: " + mnySpnd +"$");
        System.out.println("Country is: " + country);
        System.out.println("Salary is: " + salary + "$");
        System.out.println("Dept is: " + dept);
    }
}
    

