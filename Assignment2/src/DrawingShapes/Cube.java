package DrawingShapes;


	public class Cube extends Shapes {
		@Override
		void draw() {
		System.out.println("Drawing a Cube");

		}


		public static void main(String[] args) {
		Line l1=new Line();
		l1.draw();
		Rectangle r1=new Rectangle();
		r1.draw();
		Cube c1=new Cube();
		c1.draw();

		}



		}

