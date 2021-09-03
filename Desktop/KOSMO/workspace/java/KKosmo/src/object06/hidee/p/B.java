package object06.hidee.p;

public class B {
	public int n; //다른패키지에서도 접근가능
	public void n() {
		n = 5;
	}
	protected int k; //같은 패키지만 접근가능
	protected void k() {
		k = 5;
	}
	
	int m=1;	//default. 같은 패키지만 접근가능
	void m() {
		m=10;
	}
	
	private int p; //같은 클래스 내에서만 접근가능
	private void p() {
		setP(10);
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
}
