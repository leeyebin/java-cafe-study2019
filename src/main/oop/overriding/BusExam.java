package main.oop.overriding;

import main.oop.overriding.classes.Bus;

public class BusExam {
	public static void main(String args[]) {
		Bus bus = new Bus();
		bus.run(); // Car의 run메소드가 실행된다.
	}
}