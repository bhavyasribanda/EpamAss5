package EPAMAssignmentLog.LoggingAssignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.*;
//import java.util.logging.Logger;
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
        Interest interest = new Interest() ;
        String fileName = "Result.ser" ;
        Scanner sc = new Scanner(System.in) ;
        logger.info("Please enter the principal amount : ") ;
        double principleAmount = sc.nextDouble() ;
        logger.info("Please enter the duration hours : ") ;
        int time = sc.nextInt() ;
        logger.info("Please enter the rate of interest : ");
        double rateOfInterest = sc.nextDouble() ;
        logger.info("No.of compounded times : ");
        int compoundTimes = sc.nextInt() ;
        try {
        FileOutputStream file = new FileOutputStream(fileName) ;
        ObjectOutputStream out = new ObjectOutputStream(file) ;
			out.writeObject(interest) ;
        logger.info("Compound Interest : "+interest.compoundInterest(principleAmount , time , rateOfInterest ,compoundTimes));
        logger.info("Simple Interest : "+interest.simpleInterest(principleAmount , time , rateOfInterest));
        out.close();
        file.close();
        logger.info("Object has been intialized" );}catch(IOException e) {
        	e.printStackTrace();
        }
    }
}
