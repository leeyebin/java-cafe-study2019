package main.oop.abstract_class_exam;

import main.oop.abstract_class_exam.classes.Action;

//MyAction�� ������� �ʰ� Action�� ��ӹ޴� �͸� Ŭ����
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