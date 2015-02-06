/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wilondja
 */
public class IntNum {

    private ArrayList<Integer> numUserEnters = new ArrayList();
    Scanner userNum = new Scanner(System.in);

    public ArrayList<Integer> getInts(int numOfInt) {
        System.out.printf("Enter %d integers:", (int) numOfInt);
        for (int i = 0; i < numOfInt; i++) {
            try {
                numUserEnters.add(userNum.nextInt());
            } catch (Exception ex) {
                System.out.println("All value must be integer");
                //PT -- i-- here, so that you get 10 integers
            }
        }
        return numUserEnters;
    }

}
