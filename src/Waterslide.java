/**
 * WaterSlide.java
 *
 * Waterslide class for hw9
 *
 * @author Jacob Mobley, CS-180 Black LC2
 *
 * @version 10-24-22
 *
 */
public class Waterslide extends Ride {
    private double	splashDepth;
    public Waterslide(String name, String color, int minHeight, int maxRiders, double splashDepth) {
        super(name, color, minHeight, maxRiders);
        this.splashDepth = splashDepth;
    }

    public double getSplashDepth() {
        return splashDepth;
    }

    public void setSplashDepth(double splashDepth) {
        this.splashDepth = splashDepth;
    }

    @Override
    public boolean equals(Object o) {
        try {
            return o.getClass() == this.getClass() &&
                    ((Waterslide) o).getColor().equals(this.getColor()) &&
                    ((Waterslide) o).getMaxRiders() == this.getMaxRiders() &&
                    ((Waterslide) o).getMinHeight() == this.getMinHeight() &&
                    ((Waterslide) o).getSplashDepth() == this.getSplashDepth();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s Color: %s MinHeight: %d inches MaxRiders: %d SplashDepth: %.1f feet",
                this.getName(), this.getColor(), this.getMinHeight(), this.getMaxRiders(), this.splashDepth);
    }
}
