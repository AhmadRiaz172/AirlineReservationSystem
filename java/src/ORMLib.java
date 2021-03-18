import java.sql.*;
import java.util.*;


public class ORMLib {   

    private final String connectionStrig =  "jdbc:mysql://localhost:3306/airlinebooking?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String user = "root";
    private final String pass = "";
    public ArrayList<Aircraft> getAircraftList( ){
        ArrayList <Aircraft> list = new ArrayList<Aircraft>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig,user,pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from aircraft");
			while (myRs.next()) {
                Aircraft aircraft = new Aircraft();
                aircraft.setAircraft_id( Integer.parseInt( myRs.getString("aircraft_id")));
                aircraft.setPassenger_capacity( Integer.parseInt( myRs.getString("passenger_capacity")));
                aircraft.setRemaining_years( Integer.parseInt( myRs.getString("reamaining_year")));
                list.add(aircraft);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed aircraft list");
        } 
        
        return list;
    }


    public ArrayList<Flight> getFlightList( ){
        ArrayList <Flight> list = new ArrayList<Flight>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig,user,pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from flight");
			while (myRs.next()) {
               Flight flight = new Flight();
                flight.setFlight_id(Integer.parseInt( myRs.getString("flight_id")));
                flight.setAircraft_id(Integer.parseInt( myRs.getString("aircraft_id")));
                flight.setDepartur_date_time( myRs.getString("departure_date_time"));
                flight.setArrival_date_time( myRs.getString("arrival_date_time"));
                flight.setArrival_airport(Integer.parseInt( myRs.getString("arrival_airport")));
                flight.setDeparture_airport(Integer.parseInt( myRs.getString("departure_airport")));
                list.add(flight);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed flight list");
        } 
        
        return list;
    }



    
    public ArrayList<Booking_agen> getBooking_agenList( ){
        ArrayList <Booking_agen> list = new ArrayList<Booking_agen>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig,user,pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from booking_agen");
			while (myRs.next()) {
                Booking_agen booking_agen = new Booking_agen();
                booking_agen.setAgent_id(Integer.parseInt( myRs.getString("agent_id")));
                booking_agen.setAgent_name( myRs.getString("agent_name"));
                booking_agen.setAgent_address( myRs.getString("agent_address"));
                list.add(booking_agen);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed booking_agent list");
        } 

        return list;
    }


    
    public ArrayList<Airport> getAirportList( ){
        ArrayList <Airport> list = new ArrayList<Airport>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig,user,pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from airport");
			while (myRs.next()) {
                Airport airport = new Airport();
                airport.setAirport_id(Integer.parseInt( myRs.getString("airport_id")));
                airport.setNumber_of_runways(Integer.parseInt( myRs.getString("number_of_runways")));
                airport.setAirport_location( myRs.getString("airport_location"));
                
                list.add(airport);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed airprt list");
        } 

        return list;
    }



    public ArrayList<Passenger> getPassengerList( ){
        ArrayList <Passenger> list = new ArrayList<Passenger>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig,user,pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from passenger");
			while (myRs.next()) {
                Passenger passenger = new Passenger();
                passenger.setPassenger_id(Integer.parseInt( myRs.getString("passenger_id")));
                passenger.setPassenger_name( myRs.getString("passenger_name"));
                passenger.setPassenger_gender( myRs.getString("passenger_gender"));
                passenger.setPassenger_age(Integer.parseInt( myRs.getString("passenger_age")));
                list.add(passenger);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed passenger list");
        } 

        return list;
    }


    
    public ArrayList<Payment> getPaymentList( ){
        ArrayList <Payment> list = new ArrayList<Payment>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig, user , pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from payment");
			while (myRs.next()) {
                Payment payment = new Payment();
                payment.setAmount(Integer.parseInt( myRs.getString("amount")));
                payment.setPayment_status( myRs.getString("payment_status"));
                payment.setPayment_id(Integer.parseInt( myRs.getString("payment_id")));
                list.add(payment);  
            }
        }catch(Exception exe){
            System.out.println("Unable to raed payment list");
        } 

        return list;
    }


    public ArrayList<Reservation> getReservationList( ){
        ArrayList <Reservation> list = new ArrayList<Reservation>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig, user , pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from reservation");
			while (myRs.next()) {
                Reservation reservation = new Reservation();
                reservation.setReservation_id(Integer.parseInt( myRs.getString("reservation_id")));
                reservation.setReservation_status(myRs.getString("reservation_status"));
                reservation.setReservation_date( myRs.getString("reservation_date"));
                reservation.setTravel_class_id(Integer.parseInt( myRs.getString("travel_class_id"))); 
                reservation.setPassenger_id(Integer.parseInt( myRs.getString("payment_id")));
                reservation.setAgent_id(Integer.parseInt( myRs.getString("agent_id")));
                reservation.setPassenger_id(Integer.parseInt( myRs.getString("passenger_id")));
                list.add(reservation);  
            }
        }catch(Exception exe){
            System.out.println("Unable to read reservation list");
        } 

        return list;
    }



    
    public ArrayList<Travelling_class> getTravelling_class( ){
        ArrayList <Travelling_class> list = new ArrayList<Travelling_class>() ;
        Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
			myConn = DriverManager.getConnection(connectionStrig, user , pass);	
			myStmt = myConn.createStatement();			
			myRs = myStmt.executeQuery("select * from reservation");
			while (myRs.next()) {
                Travelling_class travelling_class = new Travelling_class();
                travelling_class.setTravelling_class_id(Integer.parseInt( myRs.getString("class_id")));
                travelling_class.setFoot_rest(Integer.parseInt( myRs.getString("foot_rest")));
                travelling_class.setClass_name(myRs.getString("class_name"));
                list.add(travelling_class);  
            }
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

        return list;
    }





    
    public void insertInTravelling_class(int id , String class_name, int foot_rest  ){
        Connection myConn = null;
		
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `travelling_class` (`class_id`, `class_name`, `foot_rest`) VALUES(?, ?, ?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setString (2, class_name);
            preparedStmt.setInt(3, foot_rest);

            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }



    public void insertInAircraft(int id , int passenger_capacity, int reamaining_year  ){
        Connection myConn = null;
		
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `aircraft` (`aircraft_id`, `passenger_capacity`, `reamaining_year`) VALUES(?, ?, ?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setInt(2, passenger_capacity);
            preparedStmt.setInt(3, reamaining_year);

            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }



    public void insertInAirport(int id , int no_of_runways, String location  ){
        Connection myConn = null;
	    
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `airport` (`airport_id`, `number_of_runways`, `airport_location`) VALUES(?, ?, ?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setInt(2, no_of_runways);
            preparedStmt.setString(3, location);

            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }



    public void insertInPayment(int id , int amount, String status  ){
        Connection myConn = null;
	    
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `payment` (`payment_id`, `amount`, `payment_status`) VALUES(?, ?, ?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setInt(2, amount);
            preparedStmt.setString(3,status);

            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }




    
    public void insertInPassenger(int id , String name , String gender , String Age  ){
        Connection myConn = null;
	    
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `passenger` (`passenger_id`, `passenger_name`, `passenger_gender`, `passenger_age`) VALUES(?, ?, ?,?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3,gender);
            preparedStmt.setString(4,Age);

            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }


    
    public void insertInBookingAgent(int id , String name , String address  ){
        Connection myConn = null;
	    
        try{       
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex ){
            System.out.println("Class not found");
        }

		try {
            
            myConn = DriverManager.getConnection(connectionStrig, user , pass);	
            
            String query = "INSERT INTO `booking_agen` (`agent_id`, `agent_name`, `agent_address`) VALUES(?, ?, ?)";

            PreparedStatement preparedStmt = myConn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3,address);
            preparedStmt.execute();
            
        }catch(Exception exe){
            System.out.println("Unable to read travel_class list");
        } 

    }









}
