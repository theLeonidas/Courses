package org;

import com.sun.xml.internal.ws.config.metro.dev.FeatureReader;
import org.methods.*;

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

        App methodFeatures = new App();
//      methodFeatures.register(new ReturnValues());
//      methodFeatures.register(new MethodParameters());
//      methodFeatures.register(new MethodOverloading());
//        methodFeatures.register(new PassByValue());
//        methodFeatures.displayFeatures();
//        methodFeatures.register(new Constructors());
        methodFeatures.register(new StaticMembers());
        methodFeatures.displayFeatures();
    }
}
