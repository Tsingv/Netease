import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetMethod {
    public String get(String httpurl) {
        String res = null;
        try {
            URL url = new URL(httpurl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if (connection.getResponseCode() == 200) {
                InputStream is = connection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                StringBuffer sbf = new StringBuffer();
                String tmp = null;
                while ((tmp = br.readLine()) != null) {
                    sbf.append(tmp);
                    sbf.append("\r\n");
                }
                res = sbf.toString();
                connection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;

    }
}
