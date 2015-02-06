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
public class Triangle extends MainShape {

    int sideOne, sideTwo, sideThree;
    double s;
//PT -- javadoc? -4
    public Triangle(int s1, int s2, int s3)
            throws IllegalArgumentException, ArithmeticException {
        if (s1 < 0 || s2 < 0 || s3 < 0) {
            throw new IllegalArgumentException();
        } else if (s1 >= s2 + s3 || s2 >= s1 + s3 || s3 >= s1 + s2) {
            throw new ArithmeticException();
        } else {
            sideOne = s1;
            sideTwo = s2;
            sideThree = s3;
            s = .5 * (s1 + s2 + s3);
        }
    }

    @Override
    public double getArea() {
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }

    /**
     * 
     * @return  the perimeter of the tri
     */
    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
