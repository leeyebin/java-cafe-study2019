package main.oop.interfaces.classes;

public class 펭귄 extends 조류 implements 날수있는 {
	public 펭귄() {
		this.className = "펭귄";
	}

	@Override
	public void fly() {
		System.out.println(className + "가 날고 있음..");
	}
}
