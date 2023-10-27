package main.property;

public class PropertyType {
    private PropertyType propertyType;
    private StructureType structureType;

    public boolean equals(PropertyType p) {
        return propertyType == p.propertyType && structureType == p.structureType;
    }
}
