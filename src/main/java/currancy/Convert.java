package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Convert {
    public float convert(UserRequest b ,reader a) throws IOException, ParseException, InterruptedException {
        JSONObject currancyConvert = a.parser(a.read(b));
        float basePointFloat = Float.parseFloat((String) currancyConvert.get(b.getBasePoint()));
        float desirePointFloat = Float.parseFloat((String) currancyConvert.get(b.getDesirePoint()));
        float finalyPointFloat = (basePointFloat * b.getCurrancy())/ desirePointFloat;
        return  finalyPointFloat;

    }
}
