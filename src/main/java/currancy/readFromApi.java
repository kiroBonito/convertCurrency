package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class readFromApi implements reader {
    private static final String DATA = "http://localhost:8006/rates/";
    private JSONObject json;


    @Override
    public String read(UserRequest a) throws IOException, InterruptedException, ParseException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(DATA+a.getBasePoint()))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    @Override
    public JSONObject parser(String json) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsoner = (JSONObject) jsonParser.parse(json);
        return jsoner;

    }


}
