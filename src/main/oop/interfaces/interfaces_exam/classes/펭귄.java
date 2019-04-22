package main.oop.interfaces.interfaces_exam.classes;

public class 펭귄 extends 조류 implements 헤엄칠수있는 {
	public 펭귄() {
		this.className = "펭귄";
	}

	@Override
	public void swim() {
		System.out.println(className + "이 헤엄치고 있음..");
	}
}
