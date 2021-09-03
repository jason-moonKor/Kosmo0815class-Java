package object06.cooperation;

public class Student {
	String studentName;
	public int grade;
	public int money;
	public int busFee = 1000;
	public int subFee = 1500;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		System.out.println(this.studentName + "이 버스를 탔습니다");
		bus.take(busFee);
		this.money -= busFee;
	}

	public void takeSubway(Subway subway) {
		System.out.println(this.studentName+ "이 지하철을 탔습니다");
		subway.take(subFee);
		this.money -= subFee;
	}

	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "입니다.");
	}

}