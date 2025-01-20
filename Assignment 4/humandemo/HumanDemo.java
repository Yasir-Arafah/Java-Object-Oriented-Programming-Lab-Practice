/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humandemo;

/**
 *
 * @author Prince
 */
public class HumanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Human mom = new Human();
        mom.setSkinTone("Fair");
        mom.setHair("Black");
       
        Human dad = new Human();
        dad.setSkinTone("Yellow");
        dad.setHair("Brown");
    
        Human baby = new Human();
        baby = mom.produceMixedChild(mom);
        System.out.println("\nBaby's SkinTone is: " +baby.getSkinTone() + "\nBaby's Hair color is: " +baby.getHair());
    }
    
}
