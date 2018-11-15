import java.util.ArrayList;

public class DistanceDataBase
	{
		public static ArrayList <DistancePOJO> dataBase = new ArrayList <DistancePOJO>();
		
		public static void fillarray (){
			dataBase.add(new DistancePOJO("Foot", 3.28084));
			dataBase.add(new DistancePOJO ("Meter", 1));
			dataBase.add(new DistancePOJO("Kilometer", 0.001));
			dataBase.add(new DistancePOJO("Inch", 39.3701));
			dataBase.add(new DistancePOJO("Mile", 0.000621371));
		}
	}
