package currancy;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Convert implements iparser {
    public double convert(UserRequest b ,ireader a) throws IOException, ParseException, InterruptedException {
        JSONObject currancyConvert = parser(a.read(b));
        JSONObject currancyArray = (JSONObject) currancyConvert.get("rates");
        if (b.getBasePoint().equals("EUR")) {
            double desirePointFloat = (double) currancyArray.get(b.getDesirePoint());
            double finalyPointFloat = desirePointFloat * b.getCurrancy();
            return finalyPointFloat;
        }
        else if(b.getDesirePoint().equals("EUR")) {
            double basePointFloat = (double) currancyArray.get(b.getBasePoint());
            double finalyPointFloat = b.getCurrancy()/basePointFloat;
            return finalyPointFloat;
            }
        else {
            double basePointFloat = (double) currancyArray.get(b.getBasePoint());
            double desirePointFloat = (double) currancyArray.get(b.getDesirePoint());
            double finalyPointFloat = (basePointFloat * b.getCurrancy()) / desirePointFloat;
            return finalyPointFloat;
        }

    }

    @Override
    public JSONObject parser(String json) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsoner = (JSONObject) jsonParser.parse(json);
        return jsoner;
    }
}
