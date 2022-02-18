package decorator;

public abstract class ShapeDecorator implements Shape {

Shape decoratedshape;

ShapeDecorator(Shape decoratedshape)
{
	this.decoratedshape =decoratedshape;
}
	
public void draw() {
	decoratedshape.draw();
}
}