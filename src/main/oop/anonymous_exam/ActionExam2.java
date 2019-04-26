package main.oop.anonymous_exam;

import main.oop.anonymous_exam.classes.Action;

//MyAction을 사용하지 않고 Action인터페이스를 구현하는 익명 클래스
public class ActionExam2 {
	public static void main(String args[]) {
		Action action = () -> System.out.println("exec");
		action.exec();
	}
}