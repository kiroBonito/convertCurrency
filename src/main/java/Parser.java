import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface Parser {
     public JSONObject fileParse(String fileWay) throws IOException, ParseException;

}
