package com.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {

    public static final int width = 700;
    public static final int height = 500;
    public JButton[] buttons;

    private JPanel upPanel;
    private JPanel downPanel;

    private GameFrame frame;

    public GameFrame(){


        super("Tic-Tac-Toe Game");
        setLocation(0,0);
        setSize(width, height);

        buttons = new JButton[9];

        upPanel = new JPanel();
        upPanel.setSize(width,80);
        upPanel.setLocation(0, 0);
        upPanel.setBackground(Color.GREEN);
        add(upPanel);

        downPanel = new JPanel();
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
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            downPanel.add(buttons[i]);

        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a){

        Object source = a.getSource();
        if(source == buttons[0]) {
            buttons[0].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[1]) {
            buttons[1].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[2]) {
            buttons[2].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[3]) {
            buttons[3].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[4]) {
            buttons[4].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[5]) {
            buttons[5].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[6]) {
            buttons[6].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[7]) {
            buttons[7].setText("X");
            downPanel.repaint();
        }
        if(source == buttons[8]) {
            buttons[8].setText("X");
            downPanel.repaint();
        }
    }

}