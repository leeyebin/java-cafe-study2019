package main.oop.interfaces.interfaces_exam;


import main.oop.interfaces.interfaces_exam.classes.날수있는;
import main.oop.interfaces.interfaces_exam.classes.박쥐;
import main.oop.interfaces.interfaces_exam.classes.펭귄;
import main.oop.interfaces.interfaces_exam.classes.헤엄칠수있는;

public class Example2 {
	/**
	 * 인터페이스 구현체는 해당 인터페이스로 변환 가능
	 */
	public static void main(String[] args) {
		날수있는 canFlyAnimal = new 박쥐();
		헤엄칠수있는 canSwimAnimal = new 펭귄();

		canFlyAnimal.fly();
		canSwimAnimal.swim();
	}
}