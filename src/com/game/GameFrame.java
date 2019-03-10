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
    private JTextField textWindow;
    private JPanel downPanel;

    private GameFrame frame;

    private int shapeNumber = 0; // określa jaki znak ma być rysowany X lub O

    public GameFrame(){


        super("Tic-Tac-Toe Game");
        setLocation(0,0);
        setSize(width, height);

        buttons = new JButton[9];

        upPanel = new JPanel();
        upPanel.setSize(width,80);
        upPanel.setLocation(0, 0);
        upPanel.setBackground(Color.ORANGE);

        textWindow = new JTextField("GRĘ ROZPOCZYNA GRACZ O!");
        textWindow.setFont(new Font("TimesRoman", Font.BOLD, 25));
        textWindow.setForeground(Color.red);
        upPanel.add(textWindow);
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
            buttons[0].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");

        }
        if(source == buttons[1]) {
            buttons[1].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[2]) {
            buttons[2].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[3]) {
            buttons[3].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[4]) {
            buttons[4].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[5]) {
            buttons[5].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[6]) {
            buttons[6].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[7]) {
            buttons[7].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");
        }
        if(source == buttons[8]) {
            buttons[8].setText(countShapeNumber());
            downPanel.repaint();

            getGameResult();

            if (!getGameResult()){
                textWindow.setText(generatMessage());
            }
            if (getGameResult() == false && shapeNumber == 9)
                textWindow.setText("REMIS!");

        }
    }

    public String countShapeNumber(){
        if (shapeNumber % 2 == 1) {
            shapeNumber++;
            return "X";
        }
        else {
            shapeNumber ++;
            return "O";
        }
    }

    public String generatMessage(){
        if (shapeNumber % 2 == 1) return "KOLEJ GRACZA  X ";

        else return "KOLEJ GRACZA  O ";
    }

    public boolean getGameResult(){
        if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O"){
            textWindow.setText("Brawo! Wygrał gracz O!");
            return true;
        }
        // określenie dla X

        if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X"){
            textWindow.setText("Brawo! Wygrał gracz X!");
            return true;
        }
        else
            return false;

    }




}