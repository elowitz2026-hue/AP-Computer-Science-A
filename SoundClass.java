/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
import javax.sound.sampled.*;
import java.io.File;

public class SoundClass {
    public static void playSound (String filePath) {
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            
           /* // ONLY wait here for end sounds
            while(clip.isRunning()) {
                Thread.sleep(50);
            }
            
            clip.close();
            */
           
            // pause so sound plays first
            Thread.sleep(3000);
            
        }   catch (Exception e) {
            System.out.println("Error playing sound.");
        }
    } 
}
