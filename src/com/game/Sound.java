package com.game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;


public class Sound {

    public static void playSound(){
        try {
            String soundName = "recording1.wav";
            AudioInputStream audio= AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
