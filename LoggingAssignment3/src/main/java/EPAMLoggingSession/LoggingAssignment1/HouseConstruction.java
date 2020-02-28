package EPAMLoggingSession.LoggingAssignment1;

import java.io.Serializable;

public class HouseConstruction implements Serializable {
	public double costOfBuilding(double areaOfHouse, String buildingType) {
		// TODO Auto-generated method stub
		double totalCost = 0;
		if(buildingType.equalsIgnoreCase("standard materials")) {
			//constructing house using standard materials
			totalCost = (areaOfHouse)*1200 ;
		}
		else if(buildingType.equalsIgnoreCase("above standard materials")) {
			//constructing house using above standard materials
			totalCost = (areaOfHouse)*1500 ;
		}
		else if(buildingType.equalsIgnoreCase("high standard material")) {
			//constructing house using high standard materials
			totalCost = (areaOfHouse)*1800 ;
		}
		else if(buildingType.equalsIgnoreCase("high standard material and fully automated home")) {
			//constructing house using high standard material and fully automated home
			totalCost = (areaOfHouse)*2500 ;
		}
		return totalCost ;
	}

}
