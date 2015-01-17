/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author wilondja
 */
public class Rectangle extends MainShape {

    int width, length;

    public Rectangle(int width, int length)
            throws IllegalArgumentException {
        if (width < 0 || length < 0) {
            throw new IllegalArgumentException();
        } else {
            this.width = width;
            this.length = length;
        }
    }
    /**
     * 
     * @return  get me the area of recta
     */


    @Override
    public double getArea() {
        return length * width;
    }
/**
 * 
 * @return  get me per of the recta
 */
 
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}


    

