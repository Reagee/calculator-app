package sample;

import javafx.beans.property.SimpleDoubleProperty;

public class calcTable {
    private final SimpleDoubleProperty rRes;

    public calcTable(Double sRes)
    {
        this.rRes = new SimpleDoubleProperty(sRes);
    }

    public Double getRRes(){
        return rRes.get();
    }
}
