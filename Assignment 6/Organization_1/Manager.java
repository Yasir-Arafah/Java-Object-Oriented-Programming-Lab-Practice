package Organization;

public class Manager extends Employee implements infoEmployee{
    
    Manager()
    {
        
    }
    Manager(String name , int phnNmbr , String email , double salary  ,String dept )
    {
        super(name , phnNmbr , email, salary , dept);
    }
    
    public void isManager()
   {
        System.out.println("Organization's Name is: " + orgName);
        System.out.println("Name is: " + name);
        System.out.println("Phone Number is: " + phnNmbr);
        System.out.println("Email is: " + email);
        System.out.println("Salary is: " + salary + "$");
        System.out.println("Department is: " + dept);
        System.out.println("Country is: " + country + "\n");
        
   }
   public void setCountry(String country)
   {
       this.country = country;
   }
}
