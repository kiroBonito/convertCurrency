package currancy;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, InterruptedException{
        Scanner scanner = new Scanner(System.in);
         Service service = new Service();
        service.service();
//        readFromApi api = new readFromApi();
//        UserRequest user = new UserRequest(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat());
//        String apistring = api.read(user);
//        JSONObject currancyConvert = api.parser(apistring);
//        JSONObject currancyArray = (JSONObject) currancyConvert.get("rates");
//        System.out.println(currancyArray.toJSONString());
    }
}
