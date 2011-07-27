/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kap.view;

/**
 *
 * @author Julian Caicedo (spark990@gmail.com)
 */
public class Start {

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

}
