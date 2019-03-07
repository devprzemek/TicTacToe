package com.game;


import javax.swing.*;
import java.awt.*;

public class Game {

    public Game(){
        JFrame frame = new GameFrame();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Game();
        }
        });
    }
}


