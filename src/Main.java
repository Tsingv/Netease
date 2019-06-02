import org.farng.mp3.TagException;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, TagException {
        GetInfo info = new GetInfo("1230600");
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
        mp.setInfo(INFO,lyr);
        File file = new File("/home/clearain/piiiict");
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(new GetMethod().getpic("http://p1.music.126.net/6HMHsDBAcwRziVIQTv1LFA==/827932255758680.jpg"));
        fo.flush();
        fo.close();

    }
}
