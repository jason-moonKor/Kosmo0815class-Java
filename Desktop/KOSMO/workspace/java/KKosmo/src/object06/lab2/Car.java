package object06.lab2;

public class Car {

	String model;
	int speed;		
		
	Car(String model) {
		this.model = model;
		
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다 (시속 : " + this.speed + "km/h)");
			}
		System.out.println(this.model +"의 최고속도 입니다");
		System.out.println();
		
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	

	
	
	

}
