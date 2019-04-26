package main.oop.interfaces.interfaces_exam;


import main.oop.interfaces.interfaces_exam.classes.날수있는;
import main.oop.interfaces.interfaces_exam.classes.박쥐;
import main.oop.interfaces.interfaces_exam.classes.참새;

public class Example2 {
	/**
	 * 인터페이스 구현체는 해당 인터페이스로 변환 가능
	 */
	public static void main(String[] args) {
		날수있는[] animals = new 날수있는[2];
		animals[0] = new 박쥐();
		animals[1] = new 참새();

		animals[0].fly();
		animals[1].fly();
	}
}