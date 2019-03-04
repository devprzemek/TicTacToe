package com.game;


import java.awt.*;

public class Game{


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame();
            }
        });

    }
}
