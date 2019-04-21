package main.oop.object;

public class Car {
	String name;
	int number;

	public Car(String n) {
		name = n;
		System.out.println("이름이 " + name + "인 자동차 클래스의 생성자 입니다.");
	}
	
	public void start() {
		System.out.println(name + "의 시동이 걸렸습니다.");
	}
}