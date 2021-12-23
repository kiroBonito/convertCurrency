package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface ireader {
        public String read(UserRequest a) throws IOException, InterruptedException, ParseException;
    }

