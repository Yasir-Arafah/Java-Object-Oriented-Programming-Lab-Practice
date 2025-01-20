package box;

public class Box 
{


    public static void main(String[] args) 
    {
        Cube first = new Cube();
        Cube second = new Cube();
        Cube third = new Cube();
        Cube fourth = new Cube();
        
        first.setCubeColor("Orange");
        second.setCubeColor("Orange");
        first.setEdge(100);
        second.setEdge(100);
        
        System.out.println("First cube color: " + first.getCubeColor());
        System.out.println("First cube area: " + first.getArea());
        
        System.out.println("Second cube color: " + second.getCubeColor());
        System.out.println("Second cube area: " + second.getArea());
        
        new Cube(first).compareCube(second);
        System.out.println();
        
        third.setCubeColor("Yellow");
        third.setEdge(200);
        
        System.out.println("Second cube color: " + second.getCubeColor());
        System.out.println("Second cube area: " + second.getArea());
        
        System.out.println("Second cube color: " + third.getCubeColor());
        System.out.println("Second cube area: " + third.getArea());
        
        new Cube(second).compareCube(third);
        
        fourth.setCubeColor("Red");
        fourth.setEdge(300);
        
        System.out.println("Second cube color: " + third.getCubeColor());
        System.out.println("Second cube area: " + third.getArea());
        
        System.out.println("Second cube color: " + fourth.getCubeColor());
        System.out.println("Second cube area: " + fourth.getArea());
        
        new Cube(third).compareCube(fourth);
    }
    
}
