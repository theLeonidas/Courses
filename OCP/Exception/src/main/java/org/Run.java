package org;

import org.exception.Exceptions;
import org.exception.Feature;
import org.exception.InBuiltExceptions;

import java.util.ArrayList;
import java.util.List;

public class Run {
    //List of Array features.
    private List<Feature> featureList = new ArrayList<Feature>();

    public static void main( String[] args )throws Exception{
        Run arrayFeatureDisplay = new Run();
        //arrayFeatureDisplay.register(new Exceptions());
        arrayFeatureDisplay.register(new InBuiltExceptions());
        arrayFeatureDisplay.displayFeatures();
    }

    public void register(Feature feature){
        featureList.add(feature);
    }

    public void displayFeatures()throws Exception{
        for(Feature feature : featureList)
            feature.display();
    }
}