package main.oop.object.abstract_exam;

import main.oop.object.abstract_exam.classes.Duck;

public class DuckExam {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		//추상클래스는 인스턴스를 생성할 수 없다.
		//Bird b = new Bird(); 
	}
}