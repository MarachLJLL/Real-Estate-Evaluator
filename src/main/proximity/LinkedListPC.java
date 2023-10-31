package main.proximity;

import main.SpaceMapping.Coordinate;
import main.SpaceMapping.DistanceCalculator;

import java.util.Iterator;
import java.util.LinkedList;

/* *
 * ProximityCollection implementation with default ArrayList
 * O(n) time complexity to getClosest
 * O(n) space complexity
 * Follows the decorator design pattern by decorating an ArrayList
 */
public class LinkedListPC extends LinkedList<Coordinate> implements ProximityCollection{
    DistanceCalculator distanceCalculator;
    @Override
    public Iterator<Coordinate> getClosest(Coordinate coord, int number) {
        LinkedList<Coordinate> closestList = new LinkedList<>();
        Coordinate closest = this.get(0);
        double closestDistance = distanceCalculator.getDistance(coord, closest);
        double distance;
        for (int i = 0; i < number; i++) {
            for (Coordinate c: this) {
                distance = distanceCalculator.getDistance(coord, c);
                if (distance < closestDistance) {
                    closest = c;
                    closestDistance = distance;
                }
            }
            closestList.add(closest);
            this.remove(closest);
            closest = this.get(0);
            closestDistance = distanceCalculator.getDistance(coord, closest);
        }
        this.addAll(closestList);
        return closestList.iterator();
    }

    @Override
    public ProximityCollection copy() {
        return null;
    }
}
