package org.dataTypes.primitive;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataTypes {
    private List<Display> displayList = new ArrayList<Display>();

    public void register(Display displayDataType){
        displayList.add(displayDataType);
    }

    public void print(){
        displayList.stream()
                   .forEach((display) -> display.print());
    }
}