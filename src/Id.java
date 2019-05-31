import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Id {

    public String getID(String filename){
        File file = new File(filename);
        BufferedReader reader = null;
        String tempString = null;
        try{
            reader = new BufferedReader(new FileReader(file));

            tempString = reader.readLine();
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        String regex = "\"musicId\":(.*?),";
        Pattern r = Pattern.compile(regex);
        Matcher ma = r.matcher(tempString);
        ma.find();
        tempString = ma.group(1);
        return tempString;
    }
}