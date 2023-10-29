package main.earthMapping;

public class RectangularMap {
    int xUnits;
    int yUnits;
    public RectangularMap(int maxUnits, Coordinate upperLeft, Coordinate lowerRight) {
        double verticalDistance = upperLeft.getDistance(new Coordinate(lowerRight.getLatitude(), upperLeft.getLongitude()));
        double horizontalDistance = upperLeft.getDistance(new Coordinate(upperLeft.getLatitude(), lowerRight.getLongitude()));
    }
}
