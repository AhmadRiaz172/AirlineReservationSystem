public class Airport {
    
    private int airport_id;
    private int number_of_runways;
    private String airport_location;

    /**
     * @return int return the airport_id
     */
    public int getAirport_id() {
        return airport_id;
    }

    /**
     * @param airport_id the airport_id to set
     */
    public void setAirport_id(int airport_id) {
        this.airport_id = airport_id;
    }

    /**
     * @return int return the number_of_runways
     */
    public int getNumber_of_runways() {
        return number_of_runways;
    }

    /**
     * @param number_of_runways the number_of_runways to set
     */
    public void setNumber_of_runways(int number_of_runways) {
        this.number_of_runways = number_of_runways;
    }

    /**
     * @return String return the airport_location
     */
    public String getAirport_location() {
        return airport_location;
    }

    /**
     * @param airport_location the airport_location to set
     */
    public void setAirport_location(String airport_location) {
        this.airport_location = airport_location;
    }

}
