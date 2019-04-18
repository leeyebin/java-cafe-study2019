package main.oop.abstract_class_exam;

import main.oop.abstract_class_exam.classes.Action;

//MyAction을 사용하지 않고 Action을 상속받는 익명 클래스
public class ActionExam2 {
	public static void main(String args[]) {
		Action action = new Action() {
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}
}