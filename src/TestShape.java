/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Shape [] shapes = new Shape [6];
       
       shapes[0] = new Circle(4);
       shapes[1] = new Cube(2);
       shapes[2] = new Sphere(3);
       shapes[3] = new Square(7);
       shapes[4] = new Circle(1);
       shapes[5] = new Sphere(4);
              
       for(Shape currentShape: shapes)
       {
           if(currentShape instanceof TwoDimensionalShape)
           {
               System.out.println("This is a 2D shape.");
               System.out.printf("Its area =  %f\n", currentShape.getArea());
           }
           else if(currentShape instanceof ThreeDimensionalShape)
           {
               System.out.println("This is a 3D shape.");
               System.out.printf("Its area =  %f\n", currentShape.getArea());
               System.out.printf("Its volume =  %f\n", ((ThreeDimensionalShape) currentShape).getVolume());
           }
           else
           {
               System.out.println("This isnt 2D or 3D shape\n");
           }
           
           System.out.println("-------------------");
       }
    }
    
}
