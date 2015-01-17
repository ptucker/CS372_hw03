/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.ArrayList;

/**
 *
 * @author wilondja
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> values = new IntNum().getInts(10);
        Calc calcObject = new Calc(values);
        System.out.printf("Max is %d \n", (int)calcObject.getCalcMax());
        System.out.printf("Min is  %d \n", (int) calcObject.getCalcMin());
        System.out.printf("Average is %f \n", calcObject.getCalcAverage());
    }

}
