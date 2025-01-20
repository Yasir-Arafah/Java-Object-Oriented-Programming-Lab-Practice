package Organization;

public class Employee extends Person implements infoEmployee{
    
    public double salary;
    public String dept;
    
    Employee()
    {
        
    }
    Employee(String name , int phnNmbr , String email , double salary ,String dept)
    {
        super( name , phnNmbr ,email);
        this.salary = salary;
        this.dept = dept;
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
