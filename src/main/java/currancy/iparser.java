package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public interface iparser {
    public JSONObject parser(String json) throws ParseException;
}
