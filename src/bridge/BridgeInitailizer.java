package bridge;

import java.util.HashMap;
import java.util.Map;

public class BridgeInitailizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle redCircle = new Circle(new RedCircle(), 200, 200, 10);
		Circle greenCircle = new Circle(new GreenCircle(), 200, 200, 10);
		redCircle.draw();
		greenCircle.draw();
		 Map<Integer, String> circlelist = AddCircles();
	}

	private static Map<Integer, String> AddCircles() {
		HashMap<Integer, String> circlemap= new HashMap<Integer, String>();
		circlemap.put(1, "RedCircle");
		circlemap.put(2, "GreenCircle");
		return circlemap;
	}

}
