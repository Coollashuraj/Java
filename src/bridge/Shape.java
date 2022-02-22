package bridge;

public abstract class Shape {

	DrawShape ds;
	
	
	public Shape(DrawShape ds) {
		
		this.ds = ds;
	}


	abstract void draw();
}
