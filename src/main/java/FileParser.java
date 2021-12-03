import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class FileParser  {
    private String fileway;

    public FileParser(String fileway) {
        this.fileway = fileway;

    }

    public JSONObject fileParse() throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader file = new FileReader(this.fileway);
        JSONObject jsonObject = (JSONObject) jsonparser.parse(file);
        return jsonObject;
    }
}
