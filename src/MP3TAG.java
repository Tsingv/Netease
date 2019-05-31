import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;

import java.io.File;
import java.io.IOException;

public class MP3TAG {

    public void setInfo() throws IOException, TagException {
        MP3File file = new MP3File(new File("/home/clearain/t.mp3"));
        if(file.hasID3v2Tag()){
            System.out.println("HAS");
        }
        AbstractID3v2 id3v2 = file.getID3v2Tag();
        id3v2.clearFrameMap();
        id3v2.setSongTitle("First Song");
        id3v2.setLeadArtist("QingyuWang王清宇");
        id3v2.setAlbumTitle("TestAlbulm");
        id3v2.setSongLyric("[00:00.00]HELLO");
        System.out.println(id3v2);
        file.save();
    }
}
