import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {

    public static void main(String[] args) {
        File file = new File("fileToParse.json");

        ObjectMapper mapper = new ObjectMapper();

        try {
            Human Anton = mapper.readValue(file, Human.class);
            System.out.println(Anton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
