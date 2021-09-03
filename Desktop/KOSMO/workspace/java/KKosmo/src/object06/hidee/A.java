package object06.hidee;

public class A {
	
	public int a; //다른패키지에서도 접근가능
	public void a() {
		a = 5;
	}
	protected int b; //같은 패키지만 접근가능
	protected void b() {
		b = 5;
	}
	
	int c;	//default. 같은 패키지만 접근가능
	void c() {
		c=10;
	}
	

}
