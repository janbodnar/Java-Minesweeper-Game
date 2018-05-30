package com.zetcode;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Java Minesweeper Game
 * 
 * http://zetcode.com/tutorials/javagamestutorial/minesweeper/
 * @author Jan Bodnar
 */

public class Mines extends JFrame {

    private JLabel statusbar;
    
    public Mines() {
        
        initUI();
    }
    
    private void initUI() {

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));        
        
        setResizable(false);
        pack();
        
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Mines ex = new Mines();
            ex.setVisible(true);
        });
    }
}
