package com.game;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame(){

        super("Tic-Tac-Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocation(350,200);
        setSize(700,500);
    }

}
