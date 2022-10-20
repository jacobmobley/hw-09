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

    public AmusementPark(double admissionCost, boolean arcade, boolean bowling, boolean indoor, double land, String name, boolean outdoor, ArrayList<Ride> rides, boolean[] seasons) {
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


}
