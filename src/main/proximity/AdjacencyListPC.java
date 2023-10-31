package main.proximity;

import main.SpaceMapping.Coordinate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AdjacencyListPC extends ArrayList<Coordinate> implements ProximityCollection {
    @Override
    public Iterator<Coordinate> getClosest(Coordinate e, int number) {
        return null;
    }

    @Override
    public ProximityCollection copy() {
        return null;
    }

    @Override
    public boolean add(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Coordinate> c) {
        return false;
    }
    // Decorate ArrayListPC with additional fuctionality
}
