package Day14.상속실습_도형넓이_override;

public class Rectangle extends Shape {
	public void calcRectangle(float width, float height) {
		super.area=width*height;
	}
}
