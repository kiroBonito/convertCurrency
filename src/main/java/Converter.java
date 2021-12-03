import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface Converter {
    public float convert(User operation, FileParser file) throws IOException, ParseException;

}
