package com.game;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public static int width = 700;
    public static int height = 500;
    public JButton[] buttons;


    public GameFrame(){


        super("Tic-Tac-Toe Game");
        setLocation(0,0);
        setSize(width, height);

        buttons = new JButton[9];

        JPanel upPanel = new JPanel();
        upPanel.setSize(width,80);
        upPanel.setLocation(0, 0);
        upPanel.setBackground(Color.GREEN);
        add(upPanel);


        JPanel downPanel = new JPanel();
        downPanel.setSize(width,380);
        downPanel.setLocation(0, 80);
        downPanel.setBackground(Color.WHITE);
        add(downPanel);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setSize(width,300);
        bottomPanel.setLocation(0, 80);
        bottomPanel.setBackground(Color.GRAY);
        add(bottomPanel);


        downPanel.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++){
            buttons[i] = new JButton("----");
            downPanel.add(buttons[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);






    }

}