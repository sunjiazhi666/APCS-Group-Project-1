import java.util.ArrayList;

public class DistanceDataBase
	{
		public static ArrayList <DistancePOJO> dataBase = new ArrayList <DistancePOJO>();
		
		public static void fillarray (){
			dataBase.add(new DistancePOJO("Foot", 3.28084, 0.3048));
			dataBase.add(new DistancePOJO ("Meter", 1, 1));
			dataBase.add(new DistancePOJO("Kilometer", 0.001, 1000));
			dataBase.add(new DistancePOJO("Inch", 39.3701, 0.0254));
			dataBase.add(new DistancePOJO("Mile", 0.000621371, 1609.34));
		}
	}
