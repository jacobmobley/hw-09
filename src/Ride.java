/**
 * Ride.java
 *
 * Ride class for hw9
 *
 * @author Jacob Mobley, CS-180 Black LC2
 *
 * @version 10-24-22
 *
 */
public class Ride extends Object {
    private String color;
    private int	maxRiders;
    private int	minHeight;
    private String name;

    public Ride() {
        name = "";
        color = "";
        maxRiders = 0;
        minHeight = 0;
    }

    public Ride(String name, String color, int minHeight, int maxRiders) {
        this.color = color;
        this.maxRiders = maxRiders;
        this.minHeight = minHeight;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        try {
            return o.getClass() == this.getClass() &&
                    ((Ride) o).getColor().equals(this.color) &&
                    ((Ride) o).getName().equals(this.name) &&
                    ((Ride) o).getMaxRiders() == this.maxRiders &&
                    ((Ride) o).getMinHeight() == this.minHeight;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s Safari\nColor: %s\nMinHeight: %d inches\nMaxRiders: %d",
                name, color, minHeight, maxRiders);
    }
}
