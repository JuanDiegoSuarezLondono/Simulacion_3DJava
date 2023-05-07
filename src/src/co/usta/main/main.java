/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.co.usta.main;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author suare
 */
public class main {
    public static void main(String args[]){
    Parabolico parabolico = new Parabolico();
        JFrame jFrame = new JFrame();
        jFrame.add(parabolico);        
        jFrame.setMinimumSize(new Dimension(800,600));
        jFrame.setLocationRelativeTo(null);
        jFrame.show();
    }
    
}
