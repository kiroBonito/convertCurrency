import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    private String filename;
    private String basePoint;
    private String desirePoint;
    private float currancy;

    public User() {
        this.filename = scanner.nextLine();
        this.basePoint = scanner.nextLine();
        this.desirePoint = scanner.nextLine();
        this.currancy = scanner.nextFloat();

    }

    public String getFilename() {
        return filename;
    }

    public String getBasePoint() {
        return basePoint;
    }

    public String getDesirePoint() {
        return desirePoint;
    }

    public float getCurrancy() {
        return currancy;
    }
}
