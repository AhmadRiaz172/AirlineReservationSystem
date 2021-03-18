import java.sql.*;
import java.util.ArrayList;




public class Main {
	public static void main(String[] args) throws SQLException {

		
		System.out.println("Extracting data from few tables.");

		ORMLib ormLib = new ORMLib();
		ArrayList <Aircraft> arrayList = new ArrayList<Aircraft>();
		arrayList =  ormLib.getAircraftList();
		for ( int i = 0 ; i < arrayList.size() ; i++  ){
			System.out.println( arrayList.get(i).getAircraft_id() );
		}
		
		System.out.println("\n");

		ArrayList <Airport> arrayList1 = new ArrayList<Airport>();
		arrayList1 =  ormLib.getAirportList();
		for ( int i = 0 ; i < arrayList1.size() ; i++  ){
			System.out.println( arrayList1.get(i).getAirport_location() );
		}

		
		System.out.println("\n");

		ArrayList <Flight> arrayList2 = new ArrayList<Flight>();
		arrayList2 =  ormLib.getFlightList();
		for ( int i = 0 ; i < arrayList2.size() ; i++  ){
			System.out.println( arrayList2.get(i).getFlight_id() );
		}

		
		System.out.println("\n");

		ArrayList <Payment> arrayList3 = new ArrayList<Payment>();
		arrayList3 =  ormLib.getPaymentList();
		for ( int i = 0 ; i < arrayList3.size() ; i++  ){
			System.out.println( arrayList3.get(i).getAmount() );
		}

		
		System.out.println("\n");

		//uncomment to add data.
		//ormLib.insertInAircraft(5, 150, 10);
		//ormLib.insertInAirport(5,30,"Paris" ) ;

	}


	

}