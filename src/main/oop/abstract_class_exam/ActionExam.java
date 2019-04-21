package main.oop.abstract_class_exam;

import main.oop.abstract_class_exam.classes.Action;
import main.oop.abstract_class_exam.classes.MyAction;

//MyAction을 사용하는 클래스 ActionExam 
public class ActionExam {
	public static void main(String args[]) {
		Action action = new MyAction();
		action.exec();
	}
}