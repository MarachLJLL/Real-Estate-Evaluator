package main.property;

import main.SpaceMapping.EarthCoordinate;

import java.util.Optional;

public class Property {
    private double price;
    private double floorArea;
    private EarthCoordinate coordinate;
    private PropertyType propertyType;
    private Optional<Integer> bedrooms;
    private Optional<Integer> bathrooms;
    private String address;
    private String url;

    public PropertyType getPropertyType() {
        return propertyType;
    }
}
