/**
 * Rollercoaster.java
 *
 * Rollercoaster class for hw9
 *
 * @author Jacob Mobley, CS-180 Black LC2
 *
 * @version 10-24-22
 *
 */
public class Rollercoaster extends Ride {
    private boolean simulated;

    public Rollercoaster(String name, String color, int minHeight, int maxRiders, boolean simulated) {
        super(name, color, minHeight, maxRiders);
        this.simulated = simulated;
    }

    public boolean isSimulated() {
        return simulated;
    }

    public void setSimulated(boolean simulated) {
        this.simulated = simulated;
    }

    @Override
    public boolean equals(Object o) {
        try {
            return o.getClass() == this.getClass() &&
                    ((Rollercoaster) o).getColor().equals(this.getColor()) &&
                    ((Rollercoaster) o).getMaxRiders() == this.getMaxRiders() &&
                    ((Rollercoaster) o).getMinHeight() == this.getMinHeight() &&
                    ((Rollercoaster) o).isSimulated() == this.simulated;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nColor: %s\nMinHeight: %d inches\nMaxRiders: %d\nSimulated: %s",
                this.getName(), this.getColor(), this.getMinHeight(), this.getMaxRiders(), this.simulated);
    }
}
