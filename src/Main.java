
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, TagException, CannotWriteException, ReadOnlyFileException, InvalidAudioFrameException, CannotReadException {
        GetInfo info = new GetInfo(new Id().getID("/home/clearain/Downloads/sr.idx"));
        List<String> INFO = info.getInfo();
        System.out.println(INFO);
        String lyr = info.getlyric();
        /**
         * 0--Song Name
         * 1--Aritist
         * 2--Album
         * 3--Album Picture URL
         * 4--Song playTime
         */
        /**
         * THIS IS JUST FOR TEST FUNCTIONS
         */
        MP3TAG mp = new MP3TAG();
        mp.setInfo(INFO,lyr,new Decode().decode("/home/clearain/Downloads/mm.uc","/home/clearain/sr.mp3"));
    }
}
