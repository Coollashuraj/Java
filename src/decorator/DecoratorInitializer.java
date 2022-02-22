package decorator;

public class DecoratorInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redshape= new Shapedecoratorimplementation(new Circle());
		Shape triangleshape= new Shapedecoratorimplementation(new Triangle());
		redshape.draw();
		triangleshape.draw();
		System.out.println("executing lambda expression.");
	}

}
