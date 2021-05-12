package Dessert;

	public class Icecream extends Item {
		float quantity;
		public Icecream(float a)
		{
			quantity=a;
		}

		@Override
		public float getcost() {
			float cost = quantity*60f;
			float taxamount=(5f/100f)*cost;
			float totalcost=cost+taxamount;
			return totalcost;
		}

	}

