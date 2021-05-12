package Dessert;


	public class Candy extends Item {
		float quantity;
		public Candy(float a)
		{
			quantity=a;
		}

		@Override
		public float getcost() {
			float cost = quantity*2f*60;
			float taxamount=(5f/100f)*cost;
			float totalcost=cost+taxamount;
			return totalcost;
		}

	}


