import java.sql.Date;

public class Flight {

    private int flight_id;
    private int aircraft_id;
    private String departur_date_time;
    private String arrival_date_time;
    private int arrival_airport;
    private int departure_airport;
   


    /**
     * @return int return the flight_id
     */
    public int getFlight_id() {
        return flight_id;
    }

    /**
     * @param flight_id the flight_id to set
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    /**
     * @return int return the aircraft_id
     */
    public int getAircraft_id() {
        return aircraft_id;
    }

    /**
     * @param aircraft_id the aircraft_id to set
     */
    public void setAircraft_id(int aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    /**
     * @return String return the departur_date_time
     */
    public String getDepartur_date_time() {
        return departur_date_time;
    }

    /**
     * @param departur_date_time the departur_date_time to set
     */
    public void setDepartur_date_time(String departur_date_time) {
        this.departur_date_time = departur_date_time;
    }

    /**
     * @return String return the arrival_date_time
     */
    public String getArrival_date_time() {
        return arrival_date_time;
    }

    /**
     * @param arrival_date_time the arrival_date_time to set
     */
    public void setArrival_date_time(String arrival_date_time) {
        this.arrival_date_time = arrival_date_time;
    }

    /**
     * @return int return the arrival_airport
     */
    public int getArrival_airport() {
        return arrival_airport;
    }

    /**
     * @param arrival_airport the arrival_airport to set
     */
    public void setArrival_airport(int arrival_airport) {
        this.arrival_airport = arrival_airport;
    }

    /**
     * @return int return the departure_airport
     */
    public int getDeparture_airport() {
        return departure_airport;
    }

    /**
     * @param departure_airport the departure_airport to set
     */
    public void setDeparture_airport(int departure_airport) {
        this.departure_airport = departure_airport;
    }

}
