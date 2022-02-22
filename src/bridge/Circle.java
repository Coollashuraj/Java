package bridge;

public class Circle extends Shape {
	private int x, y, radius;

	public Circle(DrawShape ds, int x, int y, int radius) {
		super(ds);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	void draw() {
		ds.drawCircle(x,y,radius);

	}

}
