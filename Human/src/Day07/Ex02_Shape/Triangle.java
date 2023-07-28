package Day07.Ex02_Shape;

public class Triangle extends Shape {

	double weith, height;

	public Triangle() {
		this(0, 0);
		
	}

	public Triangle(double weith, double height) {
		this.weith = weith;
		this.height = height;
	}

	@Override
	double area() {
		// (가로) X (세로) /2
		return weith * height/2;
	}

	@Override
	double round() {
		// (정삼각형) : (한변의 길이) X 3
		return weith * 3;
	}
	//getter, setter

	public double getWeith() {
		return weith;
	}

	public void setWeith(double weith) {
		this.weith = weith;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//toString
	@Override
	public String toString() {
		return "Triangle [weith=" + weith + ", height=" + height + "]";
	}
	
	
	
	
}
