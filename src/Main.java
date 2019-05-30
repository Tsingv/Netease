import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        GetInfo info = new GetInfo("190000");
        List<String> INFO = info.getInfo();
        System.out.println(INFO.get(1));
        System.out.println(INFO);
        /**
         * 0--Song Name
         * 1--Aritist
         * 2--Album
         * 3--Album Picture URL
         */
        /**
         * THIS IS JUST FOR TEST FUNCTIONS
         */
    }
}
