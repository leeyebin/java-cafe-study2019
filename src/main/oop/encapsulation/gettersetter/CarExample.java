package main.oop.encapsulation.gettersetter;

import main.oop.encapsulation.gettersetter.classes.Car;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		// 잘못된 속도 변경
		myCar.setSpeed(-50);//setSpeed 접근제한자가 public이므로 외부에서 호출 가능.
		System.out.println("현재 속도: " + myCar.getSpeed());

		// 올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());

		// 멈춤
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.isStop());
		
	}

}
