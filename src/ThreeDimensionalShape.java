/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public abstract class ThreeDimensionalShape extends Shape 
{
    private final double width, length, height;
    
    public ThreeDimensionalShape(double width, double length, double height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    @Override
    public double getArea()
    {
        return width * length;
    }
    
    public abstract double getVolume();
}
