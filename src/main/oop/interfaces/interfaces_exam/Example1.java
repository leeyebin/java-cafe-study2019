package main.oop.interfaces.interfaces_exam;

import main.oop.interfaces.interfaces_exam.classes.고래;
import main.oop.interfaces.interfaces_exam.classes.날수있는;
import main.oop.interfaces.interfaces_exam.classes.참새;
import main.oop.interfaces.interfaces_exam.classes.헤엄칠수있는;

public class Example1 {
	/**
	 * 인터페이스 구현
	 */
	public static void main(String[] args) {
		날수있는 canFly1 = new 참새();
		canFly1.fly();

		헤엄칠수있는 canSwim1 = new 고래();
		canSwim1.swim();
	}
}