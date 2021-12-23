package currancy;

public class UserRequest {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public UserRequest(String basePoint, String desirePoint, float currancy) {
        this.basePoint = basePoint;
        this.desirePoint = desirePoint;
        this.currancy = currancy;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String basePoint;

    public String getBasePoint() {
        return basePoint;
    }

    public void setBasePoint(String basePoint) {
        this.basePoint = basePoint;
    }

    public String getDesirePoint() {
        return desirePoint;
    }

    public void setDesirePoint(String desirePoint) {
        this.desirePoint = desirePoint;
    }

    public float getCurrancy() {
        return currancy;
    }

    public void setCurrancy(float currancy) {
        this.currancy = currancy;
    }

    private String desirePoint;
    private float currancy;

    @Override
    public String toString() {
        return "UserRequest{" +
                "basePoint='" + basePoint + '\'' +
                ", desirePoint='" + desirePoint + '\'' +
                ", currancy=" + currancy +
                '}';
    }
}
