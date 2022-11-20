package swingkids;

/**
 *
 * @author Rajesh Kumar Sahanee
 */
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

/**
 * The Sound encapsulates a sound that can be opened from the file system and
 * later played.
 */
public class Sound {

    private AudioFormat format;
    private byte[] samples;

    /**
     * Opens a sound from a file.
     */
    public Sound(URL filename) {
        try {
            // open the audio input stream
            AudioInputStream stream
                    = AudioSystem.getAudioInputStream(filename);

            format = stream.getFormat();

            // get the audio samples
            samples = getSamples(stream);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Gets the samples of this sound as a byte array.
     */
    public byte[] getSamples() {
        return samples;
    }

    /**
     * Gets the samples from an AudioInputStream as an array of bytes.
     */
    private byte[] getSamples(AudioInputStream audioStream) {
        // get the number of bytes to read
        int length = (int) (audioStream.getFrameLength()
                * format.getFrameSize());

        // read the entire stream
        byte[] samples = new byte[length];
        DataInputStream is = new DataInputStream(audioStream);
        try {
            is.readFully(samples);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // return the samples
        return samples;
    }

    /**
     * Plays a stream. This method blocks (doesn't return) until the sound is
     * finished playing.
     */
    public void play(InputStream source) {

        // use a short, 100ms (1/10th sec) buffer for real-time
        // change to the sound stream
        int bufferSize = format.getFrameSize()
                * Math.round(format.getSampleRate() / 10);
        byte[] buffer = new byte[bufferSize];

        // create a line to play to
        SourceDataLine line;
        try {
            DataLine.Info info
                    = new DataLine.Info(SourceDataLine.class, format);
            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format, bufferSize);
        } catch (LineUnavailableException ex) {
            System.out.println(ex);
            return;
        }

        // start the line
        line.start();

        //copy data to the line
        try {
            int numBytesRead = 0;
            while (numBytesRead != -1) {
                numBytesRead
                        = source.read(buffer, 0, buffer.length);
                if (numBytesRead != -1) {
                    line.write(buffer, 0, numBytesRead);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // wait until all data is played
        line.drain();

        // close the line
        line.close();

    }

}
