package main.earthMapping;

public class Coordinate {
    /*
    Describes a
     */
    final static float earthRadius = 6371; // in km
    private double latitude;
    private double longitude;
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public float getDistance(Coordinate c) {
        return 0;
    }
}
