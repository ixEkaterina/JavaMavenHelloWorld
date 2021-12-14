import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JMHello {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
//            File file = new File(
//                    Thread.currentThread().getContextClassLoader().getResource("test.json").getFile()
//            );

            InputStream is = JMHello.class.getClassLoader().getResourceAsStream("test.json");
            Map<String, String> map = mapper.readValue( is, Map.class );
            map.forEach((k, v) -> System.out.println(v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
