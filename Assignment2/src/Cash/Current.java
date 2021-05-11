package Cash;


	public class Current extends CashTot {

		double cash_credit=75000;
		public double CashTot()
		{
		Current c1=new Current();
		return(c1.balance+c1.deposits+c1.transfer+c1.cash_credit);
		}

		public static void main(String[] args) {
		Savings s1=new Savings();
		Current c1=new  Current();
		System.out.println("The total cash in the bank is " + (s1.CashTot()+c1.CashTot()));

		}

		}

