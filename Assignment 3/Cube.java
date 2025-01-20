
package box;


public class Cube 
{
    private String cubeColor;
    private double edge;
    private Cube cubeType;
    
    public Cube()
    {
    
    }
    
    public Cube(String cubeColor, double edge)
    {
        this.cubeColor = cubeColor;
        this.edge = edge;
    }
    
    public Cube(Cube cubeType)
    {
        this.cubeType = cubeType;
    }
    
    public String getCubeColor()
    {
        return cubeColor;
    }
    
    public void setCubeColor(String cubeColor)
    {
        this.cubeColor = cubeColor;
    }
    
    public double getEdge()
    {
        return edge;
    }
    
    public void setEdge(double edge)
    {
        this.edge = edge;
    }
    
    public double getArea()
    {
        return 6* edge* edge;
    }
    
    public void compareCube(Cube obj)
    {
        double a1 = cubeType.getArea()*42/100;
        double a2 = obj.getArea()*42/100;
        
        if(a1 == a2 && obj.getCubeColor().equals(cubeType.getCubeColor()))
        {
            System.out.println("Cubes are identical");
        }
        else
        {
            System.out.println("Cubes are different");
        }
    }
}
