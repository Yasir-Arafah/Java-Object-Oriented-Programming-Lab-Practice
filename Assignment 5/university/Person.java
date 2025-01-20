
package university;

public class Person 
{
    private String Name;
    private String PhoneNumber;
    private String EmailAddress;
    private String Department;
    static private String UniversityAddress = "Tejgoan";

    public String getName() 
    {
        return Name;
    }
    public void setName(String Name) 
    {
        this.Name = Name;
    }
    public String getPhoneNumber() 
    {
        return PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) 
    {
        this.PhoneNumber = PhoneNumber;
    }
    public String getEmailAddress() 
    {
        return EmailAddress;
    }
    public void setEmailAddress(String EmailAddress) 
    {
        this.EmailAddress = EmailAddress;
    }
    public String getDepartment() 
    {
        return Department;
    }
    public void setDepartment(String Department) 
    {
        this.Department = Department;
    }
    public static String getUniversityAddress() 
    {
        return UniversityAddress;
    }
    public static void setUniversityAddress(String UniversityAddress) 
    {
        Person.UniversityAddress = UniversityAddress;
    }
    
    Person(String Name, String PhoneNumber, String EmailAddress, String Department) 
    {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.EmailAddress = EmailAddress;
        this.Department = Department;
    }
    void printAll() {
        System.out.println("Name is: " + Name);
        System.out.println("Phone Number is: " + PhoneNumber);
        System.out.println("Email Address is: " + EmailAddress);
        System.out.println("Department is: " + Department);
        System.out.println("University Address is: " + UniversityAddress);
    }
}


