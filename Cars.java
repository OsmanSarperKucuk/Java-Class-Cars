
public class Cars {
	
	int topSpeed; // in kilometers per hour (km/h)
	
	double accelarationFromZeroTo100; // in seconds (s)
	
		public static void main (String[] args){
		
			Cars tesla_Model_S, BMW_5_Series; // Declare class type
			
			tesla_Model_S = new Cars(); // Declare as object
			
			BMW_5_Series = new Cars(); // Declare as object
			
			tesla_Model_S.topSpeed = 249; // Set value for the instance variable
			
			tesla_Model_S.accelarationFromZeroTo100 = 3.3; // Set value for the instance variable
			
			BMW_5_Series.topSpeed = 330; // Set value for the instance variable
			
			BMW_5_Series.accelarationFromZeroTo100 = 3.5; // Set value for the instance variable
	
			System.out.println ("Tesla model S top speed is " + tesla_Model_S.topSpeed + " km/h");
	
			System.out.println ("Beamer 5 series top speed is " + BMW_5_Series.topSpeed + " km/h");
	
			System.out.println ("Tesla model S 0-100 km/h accelaration is " + tesla_Model_S.accelarationFromZeroTo100 + " seconds");
	
			System.out.println ("Beamer 5 series 0-100 km/h accelaration is " + BMW_5_Series.accelarationFromZeroTo100 + " seconds");
	}
	
	}
	
	
