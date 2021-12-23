package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface reader {
        public String read(UserRequest a) throws IOException, InterruptedException, ParseException;
        public JSONObject parser(String json) throws ParseException;

    }

