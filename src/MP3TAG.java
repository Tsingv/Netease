import org.farng.mp3.MP3File;
import org.farng.mp3.TagConstant;
import org.farng.mp3.TagException;
import org.farng.mp3.TagOptionSingleton;
import org.farng.mp3.id3.AbstractID3v2;
import org.farng.mp3.id3.AbstractID3v2Frame;
import org.farng.mp3.id3.FrameBodyAPIC;
import org.farng.mp3.id3.ID3v2_3Frame;
import org.farng.mp3.lyrics3.AbstractLyrics3;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MP3TAG {

    public void setInfo(List<String> info, String lyr) throws IOException, TagException {
        MP3File file = new MP3File(new File("/home/clearain/t.mp3"));
        TagOptionSingleton.getInstance().setDefaultSaveMode(TagConstant.MP3_FILE_SAVE_OVERWRITE);
        AbstractID3v2 id3v2 = file.getID3v2Tag();
        //id3v2.setFrame(new ID3v2_3Frame(new FrameBodyAPIC()));
        id3v2.clearFrameMap();
        id3v2.setSongTitle(info.get(0));
        id3v2.setLeadArtist(info.get(1));
        id3v2.setAlbumTitle(info.get(2));
        id3v2.setSongLyric(lyr);


        System.out.println(id3v2);
        file.save();
    }
}
