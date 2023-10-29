package main.property;

import main.earthMapping.Coordinate;

import java.util.Optional;

public abstract class Property {
    private double price;
    private double floorArea;
    private Coordinate coordinate;
    private PropertyType propertyType;
    private Optional<Integer> bedrooms;
    private Optional<Integer> bathrooms;


}
