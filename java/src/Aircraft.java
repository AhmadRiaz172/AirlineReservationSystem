

public class Aircraft {

    private int  aircraft_id;
    private int passenger_capacity;
    private int remaining_years;

    
    public int getAircraft_id(){
        return aircraft_id;
    }
    public int getPassenger_capacity(){
        return passenger_capacity;
    }
    public int getRemaining_years(){
        return remaining_years;
    }
    public void setAircraft_id( int id ){
        aircraft_id = id;
    }
    public void setPassenger_capacity( int capacity ){
        passenger_capacity = capacity;
    }
    public void setRemaining_years( int years ){
        remaining_years = years;
    }

}
