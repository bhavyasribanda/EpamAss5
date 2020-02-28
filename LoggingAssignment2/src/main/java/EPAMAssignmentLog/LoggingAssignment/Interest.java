package EPAMAssignmentLog.LoggingAssignment;

import java.io.Serializable;

public class Interest implements Serializable{
	public double simpleInterest(double principleAmount , int time , double rateOfInterest) {
		return (principleAmount*time*rateOfInterest)/100 ;
	}
	public double compoundInterest(double principleAmount , int time , double rateOfInterest, int compoundTimes) {
		return (Math.pow(1.0+(rateOfInterest/100), compoundTimes*time) - 1)*principleAmount ;
	}
}
