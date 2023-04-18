package chap3;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;
public class PlayMusic {

    static void playSong() {
        java.io.InputStream music;
        try {
            music = new java.io.FileInputStream(new java.io.File("D:\\ITDI SKRU ปี 2 เทอม 2\\oop_panuwat\\src\\chap3\\file_example_WAV_1MG.wav"));
            sun.audio.AudioStream aud = new sun.audio.AudioStream(music);
            sun.audio.AudioPlayer.player.start(aud);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        playSong();
    }
}//
