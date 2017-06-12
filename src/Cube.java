/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Cube extends ThreeDimensionalShape 
{
    private final double side;
    
    public Cube(double side)
    {
        super(side,side,side);

        if(side <= 0)
        {
            throw new IllegalArgumentException("Side must be > 0");
        }
        
        this.side = side;
    }
    
    public double getSide()
    {
        return side;
    }
      
    @Override
    public double getArea()
    {
        return 6 * Math.pow(super.getWidth(), 2);
    }
    
    @Override
    public double getVolume()
    {
        return Math.pow(super.getWidth(), 3);
    }
    
}
