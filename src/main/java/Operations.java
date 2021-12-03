import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operations implements Converter {
    private String basePoint;
    private String desirePoint;
    private float currancy;
    private float finalCurrancy;
    public static List<Operations> operationsList = new ArrayList<>();
    public void watchOperations(){
        List<Operations> a  = operationsList;
        for(Operations m : a) {
            System.out.println(m);
        }
    }

    public Operations(User operation, FileParser file) throws IOException, ParseException {
        this.basePoint = operation.getBasePoint();
        this.desirePoint = operation.getDesirePoint();
        this.currancy = operation.getCurrancy();
        float finalyPoint = convert(operation,file);
        this.finalCurrancy = finalyPoint;
        operationsList.add(this);
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Операция: " + currancy + " " + basePoint + " ->  " + finalCurrancy + " " + desirePoint  + '\n';
    }

    @Override
    public float convert(User operation, FileParser file) throws IOException, ParseException {
        JSONObject currancyConvert = file.fileParse();
        float basePointFloat = Float.parseFloat((String) currancyConvert.get(operation.getBasePoint()));
        float desirePointFloat = Float.parseFloat((String) currancyConvert.get(operation.getDesirePoint()));
        float finalyPointFloat = (basePointFloat * operation.getCurrancy())/ desirePointFloat;
        return  finalyPointFloat;

    }
}

