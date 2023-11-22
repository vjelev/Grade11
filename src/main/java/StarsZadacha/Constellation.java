package StarsZadacha;

import java.util.List;

public class Constellation {
    String name;
    int starsCount;
    double area;
    double mass;

    public List<Star> stars;

    public Constellation(String name, int starsCount, double area) {
        if (name.length() <= 30) {
            this.name = name;
        } else
            throw new IllegalArgumentException("Name of constellation must be up to 30 symbols long.");
        if (starsCount > 19) {
            this.starsCount = starsCount;
        } else
            throw new IllegalArgumentException("There must be more than 19 stars in a constellation.");

        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarsCount() {
        return starsCount;
    }

    public void setStarsCount(int starsCount) {
        this.starsCount = starsCount;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString(){
    return name +", "+ starsCount +", "+ area;
    }
}
