/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Prince
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Product p = new Product();
        
        p.setProductID(40);
        p.setProductWeight(69.4);
        System.out.println("Initialized ID is: " + p.getProductID() + "\nInitialized Weight is: " + p.getProductWeight());
        
        Product om1 = new Product();
        om1 = p.checkAndgenerate(90, 74.4);
        System.out.println("Calling Overloaded Method No 1");
        System.out.println("ID is: " + om1.getProductID() + "\nWeight is: " + om1.getProductWeight());
        
        Product om2 = new Product();
        om2 = p.checkAndgenerate(100);
        System.out.println("Calling Overloaded Method No 2");
        System.out.println("ID is: " + om2.getProductID() + "\nWeight is: " + om2.getProductWeight());
        
        Product om3 = new Product();
        om3 = p.checkAndgenerate(78.4);
        System.out.println("Calling Overloaded Method No 3");
        System.out.println("ID is: " + om3.getProductID() + "\nWeight is: " + om3.getProductWeight());
        
        Product om4 = new Product();
        om4 = p.checkAndgenerate(p);
        System.out.println("Calling Overloaded Method No 4");
        System.out.println("ID is: " + om4.getProductID() + "\nWeight is: " + om4.getProductWeight());

        Product om5 = new Product();
        om5 = p.checkAndgenerate(89, 91);
        System.out.println("Calling Overloaded Method No 5");
        System.out.println("ID is: " + om5.getProductID() + "\nWeight is: " + om5.getProductWeight());
        
        Product om6 = new Product();
        om6 = p.checkAndgenerate(50, 90.3);
        System.out.println("Calling Overloaded Method No 6");
        System.out.println("ID is: " + om6.getProductID() + "\nWeight is: " + om6.getProductWeight());
    }
    
}
