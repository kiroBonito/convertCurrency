package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class readFromFile implements reader{
    private String filePath;
    readFromFile(String filePath){
        this.filePath = filePath;
    }
    @Override
    public String read(UserRequest a) throws IOException, InterruptedException, ParseException {
        String content = Files.readString(Paths.get(a.getFileName()), StandardCharsets.US_ASCII);
        return content;
    }

    @Override
    public JSONObject parser(String json) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsoner = (JSONObject) jsonParser.parse(json);
        return jsoner;

    }
}
