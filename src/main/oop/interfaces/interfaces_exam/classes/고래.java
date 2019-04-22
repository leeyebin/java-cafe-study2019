package main.oop.interfaces.interfaces_exam.classes;

public class 고래 extends 포유류 implements 헤엄칠수있는 {
	public 고래() {
		this.className = "고래";
	}

	@Override
	public void swim() {
		System.out.println(className + "가 헤엄치고 있음..");
	}
}