package org;

import org.classes.Feature;
import org.classes.ReadAndWriteObjectFields;
import org.classes.StaticMembers;
import org.classes.ThisPointer;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Run
{
    List<Feature> features = new ArrayList<Feature>();

    public void register(Feature feature){
        features.add(feature);
    }

    public static void main( String[] args ){
        Run run = new Run();
        //run.register(new ReadAndWriteObjectFields());
        //run.register(new StaticMembers());
        run.register(new ThisPointer());

        run.features.stream()
                    .forEach(Feature::displayFeature);

    }
}