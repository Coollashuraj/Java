package decorator;

public class Shapedecoratorimplementation extends ShapeDecorator{

	Shapedecoratorimplementation(Shape decoratedshape) {
	super(decoratedshape);
	}
	public void draw() {
		decoratedshape.draw();
		addred(decoratedshape);
	}
	void addred(Shape shapeDecorator) {
		System.out.println("Red Circle");
		
	}

}
