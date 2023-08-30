package test;

public class MainClass {

	public static void main(String[] args) {
		A a1 = new A();
		a1.hamNormal();
		a1.hamStatic();
		
		A.hamStatic();
	}
}
