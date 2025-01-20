
package Organization;

public class Organization {
    public static void main(String[] args) {
        System.out.println("Customer's Information is: ");
        
        //showing dynamic method dispatch
        Person objC1;
        objC1 = new Customer("Prince", 16446677 , "prince.aust@gmail.com" , 500 , "America");
        objC1.Print();
        
        Customer objc2 = new Customer("Abir" , 18845646 , "abir.aust@gmail.com", 5 , "Panama");
        objc2.Print();
        
        Customer objc3 = new Customer("Saba" , 14553328 , "saba.vc@gmail.com", 1500 , "Qatar");
        objc3.Print();
        
        System.out.println("Employees's Information: ");
        
        Employee obje1 = new Employee("Anthony" , 36485159 , "anthony.mng@gmail.com" , 300 , "Service");
        obje1.setCountry("Morocco");
        obje1.isManager();
        
        Employee obje2 = new Employee("Steve" , 12478315 , "steve.apple@gmail.com" , 1000 , "CEO");
        obje2.setCountry("Canada");
        obje2.isManager();
        
        Employee obje3 = new Employee("Margot" , 18444997 , "margot.robbie@gmail.com" , 1100 , "Salesman");
        obje3.setCountry("Jamaica");
        obje3.isManager();
        
        System.out.println("Manager's Information: ");
        
        Manager objm1 = new Manager("Nick" , 49855632 , "nick@gmail.com" , 4500 , "Management");
        objm1.setCountry("Venzuela");
        objm1.isManager();
        
        Manager objm2 = new Manager("Chloé" , 12887653 , "chloe@gmail.com" , 3000 , "Management");
        objm2.setCountry("France");
        objm2.isManager();
        
        Modifying_Class objMC1 = new Modifying_Class("Abu Bakar", 89444641, "abu.bakar@yahoo.com", 4000, "UAE", 8000, "Sales Executive");
        objMC1.Print();
    }
    
}
