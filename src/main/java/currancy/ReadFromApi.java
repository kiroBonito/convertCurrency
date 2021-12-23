package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ReadFromApi implements ireader {
    private static final String DATA = "http://api.exchangeratesapi.io/v1/latest?access_key=868fe0da551c1c47997fbdf9767bc1d8";
    private JSONObject json;
    private  String endPoint;
    ReadFromApi(String endPoint){
        this.endPoint = endPoint;
    }

    @Override
    public String read(UserRequest a) throws IOException, InterruptedException, ParseException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(endPoint))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }




}
