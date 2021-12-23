package currancy;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Service  {
        public static final String BASE = "EUR";
        public void service() throws IOException, ParseException, InterruptedException{
        Interface interfacer = new Interface();
        interfacer.showFirstProcces();

        Convert converter = new Convert();
        Scanner scanner = new Scanner(System.in);
        UserRequest user = new UserRequest(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat());

        interfacer.showSecondProcces();
        int choice = scanner.nextInt();
        switch (choice) {
            case  (1):
                interfacer.showEndPointRequest();
                ReadFromApi api = new ReadFromApi(scanner.next());
                System.out.println(converter.convert(user,api));
                break;
            case (2):

                interfacer.showFilePathRequest();
                ReadFromFile file = new ReadFromFile(scanner.next());
                System.out.println(converter.convert(user,file));
                break;
        }


    }

}