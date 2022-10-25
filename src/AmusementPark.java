import java.util.ArrayList;

/**
 * AmusementPark.java
 *
 * AmusementPark class for hw9
 *
 * @author Jacob Mobley, CS-180 Black LC2
 *
 * @version 10-24-22
 *
 */
public class AmusementPark extends Object implements Park {
    private double admissionCost;
    private boolean arcade;
    private boolean bowling;
    private boolean indoor;
    private double land;
    private String name;
    private boolean outdoor;
    private ArrayList<Ride> rides;
    private boolean[] seasons;

    public AmusementPark(
            String name,
            double admissionCost,
            double land,
            ArrayList<Ride> rides,
            boolean indoor,
            boolean outdoor,
            boolean arcade,
            boolean bowling,
            boolean[] seasons) {
        this.admissionCost = admissionCost;
        this.arcade = arcade;
        this.bowling = bowling;
        this.indoor = indoor;
        this.land = land;
        this.name = name;
        this.outdoor = outdoor;
        this.rides = rides;
        this.seasons = seasons;
    }

    public boolean isArcade() {
        return arcade;
    }

    public boolean isBowling() {
        return bowling;
    }

    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        arcade = false;
        bowling = false;
    }

    public void enlarge(
        double addedLand, 
        double maxLand, 
        boolean addedIndoor, 
        boolean addedOutdoor) throws SpaceFullException {
        if (addedLand > maxLand - land) {
            throw new SpaceFullException("There is no more land to use for this park!");
        } else {
            if (addedIndoor) {
                indoor = true;
            }
            
            if (addedOutdoor) {
                outdoor = true;
            }
        }
    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight, int newMaxRiders) {
        Ride temp = rides.get(rides.indexOf(ride));
        temp.setName(newName);
        temp.setColor(newColor);
        temp.setMinHeight(newMinHeight);
        temp.setMaxRiders(newMaxRiders);
        rides.set(rides.indexOf(ride), temp);
    }

    @Override
    public double getAdmissionCost() {
        return admissionCost;
    }

    public double getLand() {
        return land;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public boolean[] getSeasons() {
        return seasons;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void addRide(Ride ride) throws WrongRideException {
        if (ride.getClass() != Rollercoaster.class) {
            throw new WrongRideException("An amusement park can only have rollercoaster rides!");
        } else {
            rides.add(ride);
        }
    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public void setArcade(boolean arcade) {
        this.arcade = arcade;
    }

    public void setBowling(boolean bowling) {
        this.bowling = bowling;
    }

    @Override
    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }
}
