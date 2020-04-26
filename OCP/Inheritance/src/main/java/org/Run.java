package org;

import org.inherit.Feature;

import java.util.ArrayList;
import java.util.List;

public class Run {

    {
        Object obj = null;
        if(obj==null)
           throw new Exception();
    }

    public Run()throws Exception{

    }
    //List of Array features.
    private List<Feature> featureList = new ArrayList<Feature>();

    public static void main( String[] args )throws Exception{
        Run arrayFeatureDisplay = new Run();
    }

    public void register(Feature feature){
        featureList.add(feature);
    }

    public void displayFeatures()throws Exception{
        for(Feature feature : featureList)
            feature.display();
    }
}