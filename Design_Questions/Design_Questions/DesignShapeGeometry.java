package Design_Questions;



/*
 * 
 * Requirements: 
1>client should be able to create shapes like circle, square , rectangle..etc,. Also framework should be able to add some more shapes later. 
2> client should be able to calculate areas of each shapes 
3> should have collection where all shapes are stored and should be able to sort on the area of the shapes


Create an abstract "shape" class with an abstract method called "getArea". Create concrete classes for each
 specific shape that implements the "getArea" method (you could use the factory pattern to handle the creation of these object types). 
 Because all these objects extend "shape" you could you store them all in the same collection type.
  For example, in Java, Collection<Shape> shapes;
 */

/*�an Interface named �GeometricShapes�
�an abstract class named �ThreeDShapes�
�two child classes of ThreeDShapes: Cylinders and Cones.
�One test class names �TestShapes�*/

public class DesignShapeGeometry {

}


/*

import java.util.*;

public class task 

{
  public static interface GeometricShapes 

  {
     public double getConeSurfaceArea();
     public double getConeVolume();

     public double getAreaCylinder();
     public double getVolumeCylinder();
  }

  public static abstract class ThreeDShapes implements GeometricShapes 

  {
     protected double coneRadius, coneHeight, coneBase;
     protected double aCylinder, hCylinder;
  }

  public static class Cones extends ThreeDShapes 

  {
     public double getConeSurfaceArea() 

     {
        return 0.5 * coneRadius+coneRadius * Math.sqrt((coneRadius * coneRadius) + (coneHeight * coneHeight));
     }

     public double getConeVolume() 

     {
        return .5 * coneBase * coneHeight;
     }


     public String toString() 

     {
        StringBuilder result = new StringBuilder();

        result.append( "Cone Radius: " + coneRadius);
        result.append( "\n\nCone Height: " + coneHeight);
        result.append( "\n\nCone Base: " + coneBase);
        result.append( "\n\nCone Surface Area: " + getConeSurfaceArea());
        result.append( "\n\nCone Volume: " + getConeVolume());

        return result.toString();

     }

  }

  public static class Cylinder extends ThreeDShapes
  {

     public double getCylinderSurfaceArea() 

     {
        return cylinderBase * cylinderHeight;
     }

     public double getCylinderVolume() 

     {
        return 2*cylinderBase + (cylinderCircumference*cylinderHeight);
     }


     public String toString() 

     {
        StringBuilder result = new StringBuilder();


        result.append( "Cylinder Base: " + cylinderBase);
        result.append( "\n\nCylinder Height: " + cylinderHeight);
        result.append( "\n\nCylinder Radius: " + cylinderRadius);
        result.append( "\n\nCylinder Circumference: " + cylinderCircumference);
        result.append( "\n\nCylinder Surface Area: " + getCylinderSurfaceArea());
        result.append( "\n\nCylinder Volume: " + getCylinderVolume());

        return result.toString();

     }
  }



  public static void main(String[] args) 

  {

     final Scanner keyboard = new Scanner(System.in);


     System.out.printf("This program will calculate the "
                            + "\nsurface area and volume of a cone.\n\n");

     System.out.printf("This program will calculate the "
                            + "\nsurface area and volume of a cylinder.\n\n");


     System.out.println(Arrays.toString(new ThreeDShapes[] { 
           new Cones() {
              { 

                 System.out.print("Enter radius: ");
                 coneRadius = keyboard.nextDouble();

                 System.out.print("Enter height: ");
                 coneHeight = keyboard.nextDouble();         

                 System.out.print("Enter base: ");
                 coneBase = keyboard.nextDouble();

              }},




           new Cylinders() 
           {
              { 

                 System.out.print("Enter base: ");
                 cylinderBase = keyboard.nextDouble();

                 System.out.print("Enter height: ");
                 cylinderHeight = keyboard.nextDouble();         

                 System.out.print("Enter radius: ");
                 cylinderRadius = keyboard.nextDouble();

                 System.out.print("Enter circumference: ");
                 cylinderCircumference = keyboard.nextDouble();                 

              }}, 
           }));


  }
}  
*/