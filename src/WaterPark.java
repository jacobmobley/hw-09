import java.util.ArrayList;

/**
 * WaterPark.java
 *
 * WaterPark class for hw9
 *
 * @author Jacob Mobley, CS-180 Black LC2
 *
 * @version 10-24-22
 *
 */
public class WaterPark implements Park {
    private String name;
    private double admissionCost;
    private double land;
    private ArrayList<Ride> rides;
    private boolean indoor;
    private boolean outdoor;
    private boolean lazyRiver;
    private boolean wavePool;
    private boolean[] seasons;

    public WaterPark(String name,
                      double admissionCost,
                      double land,
                      ArrayList<Ride> rides,
                      boolean indoor,
                      boolean outdoor,
                      boolean lazyRiver,
                      boolean wavePool,
                      boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.lazyRiver = lazyRiver;
        this.wavePool = wavePool;
        this.seasons = seasons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdmissionCost() {
        return admissionCost;
    }

    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    public double getLand() {
        return land;
    }

    public void setLand(double land) {
        this.land = land;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }


    public boolean isLazyRiver() {
        return lazyRiver;
    }

    public void setLazyRiver(boolean lazyRiver) {
        this.lazyRiver = lazyRiver;
    }

    public boolean isWavePool() {
        return wavePool;
    }

    public void setWavePool(boolean wavePool) {
        this.wavePool = wavePool;
    }

    public boolean[] getSeasons() {
        return seasons;
    }

    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        lazyRiver = false;
        wavePool = false;
    }

    public void enlarge(double addedLand,
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

    public void modifyRide(Ride ride,
                           String newName,
                           String newColor,
                           int newMinHeight,
                           int newMaxRiders,
                           double newSplashDepth) {
        Ride temp = rides.get(rides.indexOf(ride));
        temp.setName(newName);
        temp.setColor(newColor);
        temp.setMinHeight(newMinHeight);
        rides.set(rides.indexOf(ride), temp);
    }
}
