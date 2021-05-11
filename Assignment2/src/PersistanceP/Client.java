package PersistanceP;

public class Client {
	

		public static void main(String[] args) {
		Persistance p1=new FilePersistance();
		p1.persist();
		Persistance p2=new DBPersistance();
		p2.persist();


		}

		}

