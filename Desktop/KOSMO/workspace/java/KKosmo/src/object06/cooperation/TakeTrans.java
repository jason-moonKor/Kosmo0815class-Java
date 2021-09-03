package object06.cooperation;

public class TakeTrans {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student stu1 = new Student("Jason",5000);
		Student stu2 = new Student("Jenny", 20000);
		Student stu3 = new Student("Kim", 10000);
		Bus bus100 = new Bus(100);
		
		Subway subwayGreen = new Subway("7호선");
		
		stu1.takeBus(bus100);stu1.takeSubway(subwayGreen);
		stu2.takeSubway(subwayGreen);stu2.takeSubway(subwayGreen);stu2.takeBus(bus100);
		stu3.takeBus(bus100);stu3.takeSubway(subwayGreen);
		System.out.println();
		
		bus100.showinfo();
		subwayGreen.showInfo();
		stu1.showInfo();
		stu2.showInfo();
		stu3.showInfo();
		
	}
}
