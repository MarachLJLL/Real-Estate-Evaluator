package main.SpaceMapping;

public class RectangularMap {
    int xUnits;
    int yUnits;
    public RectangularMap(int maxUnits, EarthCoordinate upperLeft, EarthCoordinate lowerRight) {
        double verticalDistance = upperLeft.getDistance(new EarthCoordinate(lowerRight.getLatitude(), upperLeft.getLongitude()));
        double horizontalDistance = upperLeft.getDistance(new EarthCoordinate(upperLeft.getLatitude(), lowerRight.getLongitude()));
    }
}
