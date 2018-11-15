
public class DistancePOJO
	{
		private String name;
		private double oneMeterEqual;
		private double equalToHowManyMeter;
	
		
		public DistancePOJO (String n, double c, double e){
			name = n;
			oneMeterEqual = c;
			equalToHowManyMeter = e;
			
		}


		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public double getOneMeterEqual()
			{
				return oneMeterEqual;
			}


		public void setOneMeterEqual(double oneMeterEqual)
			{
				this.oneMeterEqual = oneMeterEqual;
			}


		public double getEqualToHowManyMeter()
			{
				return equalToHowManyMeter;
			}


		public void setEqualToHowManyMeter(double equalToHowManyMeter)
			{
				this.equalToHowManyMeter = equalToHowManyMeter;
			}

	}

	