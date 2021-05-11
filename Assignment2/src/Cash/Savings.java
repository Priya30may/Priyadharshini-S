package Cash;


	public class Savings extends CashTot {

		double fixedDeposits=200000;
		public double CashTot()
		{
		Savings s1=new Savings();
		return(s1.balance+s1.deposits+s1.transfer+s1.fixedDeposits);
		}

		}

