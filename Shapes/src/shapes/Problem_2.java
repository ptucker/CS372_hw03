/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author wilondja
 */
public class Problem_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Insert wdth and length of rectangle :");
        Rectangle rect = null;
        try 
        {
            rect =  new Rectangle(input.nextInt(), input.nextInt());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("No value should be less than 0.");
            System.exit(0);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Value must be intenger.");
            System.exit(0);
        }
        try
        {
            System.out.printf("Area is %f\n", rect.getArea());
            System.out.printf("Perimeter is %f\n\n", rect.getPerimeter());
        }
        catch(NullPointerException ex)
        {
            System.exit(0);
        }
        
        System.out.println("Insert 3 sides of triangle :");
        Triangle tria = null;
        try
        {
            tria = new Triangle(input.nextInt(), input.nextInt(), input.nextInt());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("No value should be less than 0.");
            System.exit(0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("One or more side is not VALID ");
            System.exit(0);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Values of all sides must be intenger.");
            System.exit(0);
        }
        try
        {
            System.out.printf("Area is %f\n", tria.getArea());
            System.out.printf("Perimeter is %f\n\n", tria.getPerimeter());
        }
        catch(NullPointerException ex)
        {
            System.exit(0);
        }
        
        System.out.println("Insert 2 radius for ellipse:");
        Ellipse e = null;
        try
        {
            e = new Ellipse(input.nextInt(), input.nextInt());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(" All value must be no less than 0.");
            System.exit(0);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Values of ellipse must be integer.");
            System.exit(0);
        }
        try
        {
            System.out.printf("Area is %f\n", e.getArea());
            System.out.printf("Perimeter is %f\n\n", e.getPerimeter());
        }
        catch(NullPointerException ex)
        {
            System.exit(0);
        }
    }
    
}

    
    

