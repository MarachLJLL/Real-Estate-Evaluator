package main.property;

import java.util.HashMap;
/*
Essentially an enum for AcquisitionType and StructureType combo
 */
public class PropertyType {
    private static HashMap<String, PropertyType> collectionPT = new HashMap<>();
    private AcquisitionType acquisitionType;
    private StructureType structureType;
    // private constructor for flyweight implementation
    private PropertyType(AcquisitionType acquisitionType, StructureType structureType) {
        this.acquisitionType = acquisitionType;
        this.structureType = structureType;
    }; // private constructor for flyweight design pattern
    public static PropertyType get(AcquisitionType acquisitionType, StructureType structureType) {
        PropertyType desiredPT = new PropertyType(acquisitionType, structureType);
        String dPTKey = acquisitionType.name() + structureType.name();
        if (collectionPT.containsKey(dPTKey))
            return collectionPT.get(dPTKey);
        collectionPT.put(dPTKey, desiredPT);
        return desiredPT;
    }

    public AcquisitionType getAcquisitionType() {
        return acquisitionType;
    }

    public StructureType getStructureType() {
        return structureType;
    }
    /*
    @Override
    public boolean equals(Object obj) {
        PropertyType p;
        if (obj instanceof PropertyType)
            p = (PropertyType) obj;
        else return false;
        return acquisitionType == p.acquisitionType && structureType == p.structureType;
    }

    @Override
    public int hashCode() {}

     */
}
