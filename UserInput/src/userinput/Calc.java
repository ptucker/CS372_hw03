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
public class Calc {

    int calcMax;
    int calcMin;
    double calcAverage;
    /**
     * 
     * @param values the value user inserts
     */

    public Calc(ArrayList<Integer> values) {
        for (int i = 0; i < values.size(); i++) {
            int storeNum = values.get(i);
            calcAverage +=storeNum;
            if (i == 0) {
                calcMax = storeNum;
                calcMin = storeNum;
                        

            } else {
                if (calcMax < storeNum) {
                    calcMax = storeNum;
                }
                if (calcMin > storeNum) {
                    calcMin = storeNum;
                }
            }

        }
       
        calcAverage /=values.size();// give the average

    }
    /**
     * 
     * @return  min
     */
    public  int getCalcMin(){
        return calcMin;
        
    }
    /**
     * 
     * @return  max
     */
    public int getCalcMax(){
        return calcMax;
    }
    /**
     * 
     * @return average
     */
    public double getCalcAverage(){
        return calcAverage;
    }

}
