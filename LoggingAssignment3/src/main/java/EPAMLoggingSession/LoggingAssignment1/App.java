package EPAMLoggingSession.LoggingAssignment1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import EPAMLoggingSession.LoggingAssignment1.App;
import EPAMLoggingSession.LoggingAssignment1.HouseConstruction;

/**
 * Hello world!
 *
 */
public class App 
{

	private static Logger logger = Logger.getLogger(App.class.getName()) ;
	public static void main( String[] args )
    {
        //private static Logger logger = LogManager.getLogger(App.class) ;
        HouseConstruction houseConstruction = new HouseConstruction() ;
        String fileName = "Result.ser" ;
        Scanner sc = new Scanner(System.in) ;
        logger.info("Please enter the area of the building : ") ;
        double houseCost = sc.nextDouble() ;
        logger.info("Please enter the type of material for constructing the house : ") ;
        String typeOfBuilding = sc.next() ;
        try {
        FileOutputStream file = new FileOutputStream(fileName) ;
        ObjectOutputStream out = new ObjectOutputStream(file) ;
			out.writeObject(houseConstruction) ;
        logger.info("Cost required to construct a house is : "+houseConstruction.costOfBuilding(houseCost,typeOfBuilding));
        out.close();
        file.close();
        logger.info("Object has been intialized" );}catch(IOException e) {
        	e.printStackTrace();
        }
    }

}
