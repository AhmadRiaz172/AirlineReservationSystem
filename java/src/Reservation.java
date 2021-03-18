import java.sql.Date;
public class Reservation {
    private int reservation_id;
    private String reservation_status;
    private String reservation_date;
    private int travel_class_id;
    private int payment_id;
    private int agent_id;
    private int passenger_id;
   

    /**
     * @return int return the reservation_id
     */
    public int getReservation_id() {
        return reservation_id;
    }

    /**
     * @param reservation_id the reservation_id to set
     */
    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    /**
     * @return String return the reservation_status
     */
    public String getReservation_status() {
        return reservation_status;
    }

    /**
     * @param reservation_status the reservation_status to set
     */
    public void setReservation_status(String reservation_status) {
        this.reservation_status = reservation_status;
    }

    /**
     * @return String return the reservation_date
     */
    public String getReservation_date() {
        return reservation_date;
    }

    /**
     * @param reservation_date the reservation_date to set
     */
    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    /**
     * @return int return the travel_class_id
     */
    public int getTravel_class_id() {
        return travel_class_id;
    }

    /**
     * @param travel_class_id the travel_class_id to set
     */
    public void setTravel_class_id(int travel_class_id) {
        this.travel_class_id = travel_class_id;
    }

    /**
     * @return int return the payment_id
     */
    public int getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return int return the agent_id
     */
    public int getAgent_id() {
        return agent_id;
    }

    /**
     * @param agent_id the agent_id to set
     */
    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    /**
     * @return int return the passenger_id
     */
    public int getPassenger_id() {
        return passenger_id;
    }

    /**
     * @param passenger_id the passenger_id to set
     */
    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

}
