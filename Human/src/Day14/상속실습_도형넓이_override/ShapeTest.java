package Day14.상속실습_도형넓이_override;

public class ShapeTest {

	public static void main(String[] args) {
		int width=100;
		int height=100;
		//사각형의 넓이
		Rectangle rec = new Rectangle();
		rec.calcRectangle(width, height);
		rec.printArea();
		
		// 삼각형의 넓이를 구한다.
		Triangle tri = new Triangle();
		tri.calTriangle(width, height);
		tri.printArea();
	}
}
