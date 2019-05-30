import java.io.IOException;
import java.util.List;

public class GetInfo {
    String url;
    public GetInfo(String id){
        url = "http://music.163.com/api/song/detail/?ids=["+id+"]";
    }

    public List<String> getInfo() throws IOException {
        GetMethod con = new GetMethod();
        RegexMath re = new RegexMath();
        return re.reg(con.get(url));
    }
}
