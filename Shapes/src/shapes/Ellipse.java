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
public class Ellipse extends MainShape {

    int radiusOne, radiusTwo;

    public Ellipse(int r1, int r2)
            throws IllegalArgumentException {
        if (r1 < 0 || r2 < 0) {
            throw new IllegalArgumentException();
        } else {
            radiusOne = r1;
            radiusTwo = r2;
        }
    }
    /**
     * 
     * @return get me the area of ellipse
     */

    @Override
    public double getArea() {
        return Math.PI * radiusOne * radiusTwo;
    }
    /**
     * 
     * @return  get perim of ellipse perimeter using approx 1
     */

    @Override
    public double getPerimeter() {
        return (2 * Math.PI) * Math.sqrt((Math.pow(radiusOne, 2) + Math.pow(radiusTwo, 2)) / 2);
    }
}

