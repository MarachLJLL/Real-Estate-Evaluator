package market;

import property.Property;
import property.PropertyType;

import java.util.ArrayList;
import java.util.Iterator;

public class PropertyCollection implements Iterable<Property> {
    ArrayList<Property> properties;
    PropertyType propertyType;
    public PropertyCollection() {
        properties = new ArrayList<Property>();
    }
    public boolean add(Property p) {
        return properties.add(p);
    }
    public Iterator<Property> iterator() {
        return properties.iterator();
    }
}
