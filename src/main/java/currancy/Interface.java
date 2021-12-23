package currancy;

public class Interface {
    public void showFirstProcces(){
        System.out.println("1)Введите базовую валюту из которой хотите перевести");
        System.out.println("2)Введите  валюту в которую хотите перевести");
        System.out.println("3)Введите значение");
    }
    public void showSecondProcces(){
        System.out.println("Каким способом хотите перевести?");
        System.out.println("1)API \n2)From file");
    }
    public void showEndPointRequest(){
        System.out.println("Введите endpoint");
    }
    public void showFilePathRequest(){
        System.out.println("Введите путь до файла");
    }
}
