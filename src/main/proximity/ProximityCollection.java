package main.proximity;

import main.SpaceMapping.Coordinate;

import java.util.Collection;
import java.util.Iterator;

public interface ProximityCollection extends Collection<Coordinate> {
    Iterator<Coordinate> getClosest(Coordinate e, int number);
    ProximityCollection copy();

}
