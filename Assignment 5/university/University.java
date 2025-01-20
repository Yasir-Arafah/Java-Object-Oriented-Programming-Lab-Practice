
package university;

public class University 
{


    public static void main(String[] args) 
    {
        Student stdnt1 = new Student("Abrar", "01721499713", "abrar.mahi@gmail.com", "ME", 95, 3.30);
        Student stdnt2 = new Student("Sajjad", "01915445111", "sajjad.hossain@gmail.com", "CE", 11, 3.55);
        Student stdnt3 = new Student("Zishan", "01757489703", "zishan.rokon@gmail.com", "CSE", 24, 3.92);

        Teacher tchr1 = new Teacher("Siam", "01628830182", "siam.sd@gmail.com", "CSE", 20000, "Software");
        Teacher tchr2 = new Teacher("Ataul", "01926489005", "ataul.goni@gmail.com", "ME", 70000, "Thermodynamics");
        Teacher tchr3 = new Teacher("Rasel", "01766300748", "osman.rasel@gmail.com", "IPE", 65000, "Production Analytics");

        Dean dn1 = new Dean("Abul", "01724424765", "abul.mia@gmail.com", "TE", 80000, "Manufacturing", "Engineering");
        Dean dn2 = new Dean("Bashir", "01755685240", "bashir.miah@gmail.com", "CSE", 85000, "Data Science", "Engineering");

        stdnt1.printAll();
        System.out.println("");
        stdnt2.printAll();
        System.out.println("");
        stdnt3.printAll();
        System.out.println();

        tchr1.printAll();
        System.out.println("");
        tchr2.printAll();
        System.out.println("");
        tchr3.printAll();
        System.out.println();

        dn1.printAll();
        System.out.println("");
        dn2.printAll();
        System.out.println();
    }
    
}
