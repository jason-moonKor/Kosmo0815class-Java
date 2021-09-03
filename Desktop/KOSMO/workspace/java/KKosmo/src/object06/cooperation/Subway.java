package object06.cooperation;

public class Subway {
	public String lineN;
	public int psgC;
	public int money;
	
	public Subway(String lineN) {
		this.lineN = lineN;
	}
	
	public void take(int money) {
		this.money += money;
		this.psgC++;
	}
	
	public void showInfo() {
		System.out.println("지하철 라인번호: " + lineN + "의 승객은 " + psgC + "명 이고, 수입은 " + money + "입니다");
	}

}
