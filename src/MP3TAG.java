import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

import java.io.File;
import java.io.IOException;

public class MP3TAG {
    File src = new File("/home/clearain/test.mp3");
    MP3File file = new MP3File(src);
    public MP3TAG() throws IOException, TagException {
    }

    public void setInfo(){
        System.out.println("HELLO");
    }

}
