package org.run;

import org.dataTypes.primitive.*;

public class PrimitiveDataTypesRanges {
    public static void main(String[] args) {
        DisplayDataTypes dataTypes = new DisplayDataTypes();
        dataTypes.register(new ByteInfo());
        dataTypes.register(new ShortInfo());
        dataTypes.register(new CharInfo());
        dataTypes.register(new IntInfo());
        dataTypes.register(new LongInfo());
        dataTypes.register(new FloatInfo());
        dataTypes.register(new DoubleInfo());
        dataTypes.register(new BooleanInfo());
        dataTypes.print();
    }
}