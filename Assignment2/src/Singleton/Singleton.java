package Singleton;


	public class Singleton {

		private static Singleton obj;
		protected Singleton() {

		}

		public static Singleton getObj() {

		if(obj == null)
		{
		obj = new Singleton();
		}
		return obj;
		}

		public void success() {
		System.out.println("Object created");

		}
	}

