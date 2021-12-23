package currancy;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Service {
    public static void main(String[] args) throws IOException, ParseException, InterruptedException {


        System.out.println("1)Введите базовую валюту из которой хотите перевести");
        System.out.println("2)Введите  валюту в которую хотите перевести");
        Convert converter = new Convert();
        Scanner scanner = new Scanner(System.in);
        UserRequest user = new UserRequest(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat());
        System.out.println("Каким способом хотите перевести?");
        System.out.println("1)API \n2)From file");
        int choice = scanner.nextInt();
        switch (choice) {
            case  (1):
                readFromApi api = new readFromApi();
                System.out.println(converter.convert(user,api));
                break;
            case (2):
                System.out.println("Введите путь до файла");
                user.setFileName(scanner.nextLine());
                readFromFile file = new readFromFile();
                System.out.println(converter.convert(user,file));
                break;
        }


    }
}