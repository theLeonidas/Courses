package org.run;

import org.dataTypes.DefaultValues;

public class DisplayDefaultValues {
    public static void main(String[] args) {
        DefaultValues values = new DefaultValues();

        //This will display default values of
        //all the primitive data types
        //that appear as members of a class.
        values.complexDefaults();

        //Showing values of local defaults.
        values.localDefaults();
    }
}