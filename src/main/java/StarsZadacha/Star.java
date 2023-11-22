package StarsZadacha;

public class Star implements Comparable<Star> {
    String name;
    double distance;
    int Classification;
    double mass;

    Constellation constellation;

    public Star(String name, double distance, int Classification, double mass, Constellation constellation) {
        if (name.length() <= 20) {
            this.name = name;
        } else
            throw new IllegalArgumentException("Name of star must be up to 20 symbols long.");
        if (distance > 0) {
            this.distance = distance;
        } else throw new IllegalArgumentException("Distance to star must be more than 20 light years.");
        this.Classification = Classification;
        if (mass > 0) {
            this.mass = mass;
        } else throw new IllegalArgumentException("Mass of star must be more than 0 sun masses.");
        this.constellation = constellation;
    }

    public Constellation getConstellation() {
        return constellation;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %d, %.0f, %s", name, distance, Classification, mass, constellation.toString());
    }

//    @Override
//    public int compareTo(Star o) {
//        return Double.compare(this.distance, o.distance);
//    }

    @Override
    public int compareTo(Star o) {
        // First, compare by constellation
        int constellationComparison = this.constellation.getName().compareTo(o.constellation.getName());

        // If constellations are the same, compare by mass
        if (constellationComparison == 0) {
            return Double.compare(this.mass, o.mass);
        } else {
            return constellationComparison;
        }
    }
}
