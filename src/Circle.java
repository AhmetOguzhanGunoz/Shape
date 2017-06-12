/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Circle extends TwoDimensionalShape
{
    private final double radius;
    
    public Circle(double radius)
    {
        super(radius,Math.PI);

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
    public double getPerimeter()
    {
        return 2 * super.getWidth() * super.getLength();
    }
      
    @Override
    public double getArea()
    {
        return getWidth() * getLength() * getWidth();
    }
    
}
