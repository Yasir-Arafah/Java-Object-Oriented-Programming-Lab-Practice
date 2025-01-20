package Organization;

public abstract class Person {
    public final String orgName = "General Light Service";
    public String name;
    public int phnNmbr;
    public String email;
    public String country ;
    
    Person()
    {
        
    }
    Person(String name , int phnNmbr , String email )
    {
        this.name = name;
        this.phnNmbr = phnNmbr;
        this.email = email;
    }
    void Print()
    {
        System.out.println("Organization's Name is: ");
        System.out.println("Name is: ");
        System.out.println("Phone Number is: ");
        System.out.println("Email is: ");
        System.out.println("Country is: " + "\n");
        
    }
}
