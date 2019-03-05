package com.game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public static int width = 700;
    public static int height = 500;


    public GameFrame(){

        super("Tic-Tac-Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(0,0);
        setSize(width, height);


        JPanel upPanel = new JPanel();
        upPanel.setSize(width,80);
        upPanel.setLocation(0, 0);
        upPanel.setBackground(Color.GREEN);
        add(upPanel);


        JPanel downPanel = new JPanel();
        downPanel.setBackground(Color.WHITE);
        downPanel.setSize(width,420);
        downPanel.setLocation(0, 80);
        add(downPanel);



            JButton button = new JButton("OK");
            downPanel.add(button);
            setVisible(true);






    }

}
