import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetInfo {
    String url1;
    String url2;
    public GetInfo(String id){
        url1 = "http://music.163.com/api/song/detail/?ids=["+id+"]";
        url2 = "http://music.163.com/api/song/media?id="+id;
    }

    public List<String> getInfo() throws IOException {
        GetMethod con = new GetMethod();
        RegexMath re = new RegexMath();
        return re.reg(con.get(url1));
    }
    public String getlyric(){
        GetMethod g = new GetMethod();
        Pattern p = Pattern.compile("\"lyric\":\"(.*?)\",");
        Matcher m = p.matcher(g.get(url2));
        m.find();
        return m.group(1);
    }
}
