/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public abstract class TwoDimensionalShape extends Shape
{
    private final double width, length;
    
    public TwoDimensionalShape(double width, double length)
    {
        if(width <= 0)
        {
            throw new IllegalArgumentException("Width must be > 0");
        }
        
        if(length <= 0)
        {
            throw new IllegalArgumentException("Length must be > 0");
        }
        
        this.width = width;
        this.length = length;
    }
    
    public abstract double getPerimeter();
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
   
    @Override
    public double getArea()
    {
        return getWidth() * getLength();
    }
}
