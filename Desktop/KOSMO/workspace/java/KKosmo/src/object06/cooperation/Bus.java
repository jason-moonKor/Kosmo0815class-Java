package object06.cooperation;

public class Bus {
	public int busNum;
	public int psgC;
	public int money;
	
	public Bus (int busNum) {
		this.busNum = busNum;
	}
	
	public void take (int money) {
		this.money += money;
		psgC++;
	}
	
	public void showinfo() {
		System.out.println("버스 번호: " + busNum + "번의 승객은 " + psgC + "명 이고, 수입은 " + money + "입니다");
	}
}
