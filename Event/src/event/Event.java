/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import javax.swing.JFrame;

/**
 *
 * @author wilondja
 */
public class Event {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        userInterface uI = new userInterface();
        uI.setSize(400, 400);
        uI.setVisible(true);
        uI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}