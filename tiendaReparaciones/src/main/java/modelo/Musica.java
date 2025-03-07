package modelo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
/**
 * La clase Musica proporciona funcionalidad para reproducir y detener archivos de audio.
 */
/**
 * 
 * @author JuanG
 * @version 1.0
 */
public class Musica {
    private Clip tema;
    /**
     * Crea una nueva instancia de la clase Musica a partir de un archivo de audio especificado.
     *
     * @param fichero la ruta del archivo de audio
     */

    public Musica(String fichero) {
    	 AudioInputStream audioStream;
    	 System.out.println(fichero);
        
    	 try {
        	 URL temaURL = getClass().getClassLoader().getResource(fichero);
             if (temaURL != null) {
            	
            	 audioStream = AudioSystem.getAudioInputStream(temaURL);
            	 tema = AudioSystem.getClip();
                 tema.open(audioStream);
             } else {
                 System.err.println("No se pudo cargar la musica");
             }

            
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce el archivo de audio.
     */
    public void play() {
        if (tema != null) {
            tema.start();
        }
    }
    /**
     * Detiene la reproducción del archivo de audio y lo reinicia desde el principio.
     */
    public void stop() {
        if (tema != null) {
            tema.stop();
            tema.setFramePosition(0);
        }
    }
    /**
     * Verifica si se está reproduciendo el archivo de audio.
     *
     * @return true si se está reproduciendo el archivo de audio, false en caso contrario
     */
    public boolean isPlaying() {
        return tema != null && tema.isRunning();
    }
}