package org;

import org.exception.*;

import java.io.File;
import java.io.FileNotFoundException;
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
        //arrayFeatureDisplay.register(new Exceptions());
        //arrayFeatureDisplay.register(new InBuiltExceptions());
        //arrayFeatureDisplay.register(new UncheckedExceptions());
        //arrayFeatureDisplay.register(new TryCatchFinally());
        arrayFeatureDisplay.register(new Errors());
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