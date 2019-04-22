package main.oop.object.exam1;

public class Car1 {
	// 필드
	String name;

	// 기본 생성자(매개변수가 없는)만 있다면 선언하지 않아도 되지만,
	// 객체 생성시 필드를 초기화하거나 처리하고싶은 로직이 있다면, 선언해서 사용할 수 있다.
	public Car1() {
		name = "Car";
		System.out.println("Car 클래스의 생성자 입니다.");
	}

	// 메소드
	public void start() {
		System.out.println(name + "의 시동이 걸렸습니다.");
	}
}