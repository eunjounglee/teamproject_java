package ch09;

public class CarMain {
	// SportsCar 타입의 매개변수를 받는 drive라는 메서드
	static void drive(Car car) {
		car.move();
	}
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		drive(sc);
	
		SportsCar2 sc2 = new SportsCar2();
		drive(sc2);
	}
}
