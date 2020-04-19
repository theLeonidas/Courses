package org;

import com.sun.xml.internal.ws.config.metro.dev.FeatureReader;
import org.features.*;

import java.util.ArrayList;
import java.util.List;

public class App{
    private List<Feature> features = new ArrayList<Feature>();

    public void register(Feature feature){
        features.add(feature);
    }

    public void displayFeatures(){
        features.stream().forEach(Feature::display);
    }

    public static void main( String[] args ){
        App stringFeatures = new App();
//        stringFeatures.register(new StringCreation());
//        stringFeatures.register(new PlayingWithStrings());
//        stringFeatures.register(new PlayignWithToString());
//        stringFeatures.register(new StringInterning());
//        stringFeatures.register(new StringImmutability());
        //stringFeatures.register(new PlayingWithStringEquals());
        stringFeatures.register(new PlayingWithStringBuilder());

        stringFeatures.displayFeatures();
    }
}
