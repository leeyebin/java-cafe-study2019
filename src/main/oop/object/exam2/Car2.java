package main.oop.object.exam2;

public class Car2 {
	//필드
	String name;
	int number;

	
	//생성자	
	public Car2(String n) {
		name = n;
		System.out.println("이름이 " + name + "인 자동차 클래스의 생성자 입니다.");
	}
	
	
	//메소드
	public void start() {
		System.out.println(name + "의 시동이 걸렸습니다.");
	}
}