/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Sphere extends ThreeDimensionalShape
{
    private final double radius;
    
    public Sphere(double radius)
    {
        super(radius,Math.PI,radius);

        if(radius <= 0)
        {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
   
    @Override
    public double getArea()
    {
        return 4 * Math.PI * Math.pow(super.getWidth(), 2);
    }
    
    @Override
    public double getVolume()
    {
        return (4/3) * Math.PI * Math.pow(super.getWidth(), 3);
    }
}
