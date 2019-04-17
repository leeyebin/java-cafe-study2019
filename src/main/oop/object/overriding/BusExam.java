package main.oop.object.overriding;

import main.oop.object.overriding.classes.Bus;

public class BusExam {
	public static void main(String args[]) {
		Bus bus = new Bus();
		bus.run(); // Car의 run메소드가 실행된다.
	}
}