package main.property;

import java.util.HashMap;

public class PropertyType {
    private static HashMap<PropertyType, PropertyType> collectionPT;
    private AcquisitionType acquisitionType;
    private StructureType structureType;
    // private constructor for flyweight implementation
    private PropertyType(AcquisitionType acquisitionType, StructureType structureType) {
        this.acquisitionType = acquisitionType;
        this.structureType = structureType;
    }; // private constructor for flyweight design pattern
    public PropertyType get(AcquisitionType acquisitionType, StructureType structureType) {
        PropertyType desiredPT = new PropertyType(acquisitionType, structureType);
        if (collectionPT.containsKey(desiredPT))
            return collectionPT.get(desiredPT);

        collectionPT.put(desiredPT, desiredPT);
        return desiredPT;
    }
    public boolean equals(PropertyType p) {
        return acquisitionType == p.acquisitionType && structureType == p.structureType;
    }
    // override hashcode
}
