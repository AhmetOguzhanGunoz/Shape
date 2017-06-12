/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class Square extends TwoDimensionalShape 
{ 
    private final double side;
    
    public Square(double side)
    {
       super(side,side);
       
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
    public double getPerimeter()
    {
        return 4 * super.getWidth();
    }
        
    @Override
    public double getArea()
    {
        return super.getWidth()* super.getLength();
    }
          
}
