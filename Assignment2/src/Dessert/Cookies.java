package Dessert;

	public class Cookies extends Item{
		float quantity;
		public Cookies(float a)
		{
			quantity=a;
		}

		@Override
		public float getcost() {
			float cost = quantity*3f*7;
			float taxamount=(5f/100f)*cost;
			float totalcost=cost+taxamount;
			return totalcost;
		}

	}


