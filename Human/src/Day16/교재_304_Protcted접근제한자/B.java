package Day16.교재_304_Protcted접근제한자;

public class B {

	public void method() {
		A a = new A();
		a.field= "value";
		a.method();
	}
}
