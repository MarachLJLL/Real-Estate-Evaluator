package main.SpaceMapping;

public class EarthCoordinate {
    /*
    Describes an earth coordinate
     */
    final static double earthRadius = 6371; // in km
    /*
    more accurate representation of distance with Earth not being a sphere and proper formula selection
     */
    private double latitude;
    private double longitude;
    public EarthCoordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public double getDistance(EarthCoordinate c) {
        return 0;
    }
}
