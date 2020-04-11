package org;

import org.arrays.Feature;
import org.arrays.OneDArray;
import org.arrays.TwoDArray;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Run{
    //List of Array features.
    private List<Feature> featureList = new ArrayList<Feature>();

    public static void main( String[] args ){
        Run arrayFeatureDisplay = new Run();
        arrayFeatureDisplay.register(new OneDArray());
        //arrayFeatureDisplay.register(new TwoDArray());
        arrayFeatureDisplay.displayFeatures();
    }

    public void register(Feature feature){
        featureList.add(feature);
    }

    public void displayFeatures(){
        featureList.forEach(Feature::displayFeatures);
    }
}