import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("1)Введит путь до файла JSON");
        System.out.println("2)Введите базовую валюту из которой хотите перевести");
        System.out.println("3)Введите  валюту в которую хотите перевести");
        User user1 = new User();
        FileParser file1 = new FileParser(user1.getFilename());
        Operations operation1 = new Operations(user1,file1);

            }


    }

