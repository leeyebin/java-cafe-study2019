package main.oop.object;

public class Car {
	String name;
	int number;

	public Car(String n) {
		name = n;
		System.out.println("�̸��� " + name + "�� �ڵ��� Ŭ������ ������ �Դϴ�.");
	}
	
	public void start() {
		System.out.println(name + "�� �õ��� �ɷȽ��ϴ�.");
	}
}