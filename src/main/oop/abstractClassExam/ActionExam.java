package main.oop.abstractClassExam;

import main.oop.abstractClassExam.classes.Action;
import main.oop.abstractClassExam.classes.MyAction;

//MyAction을 사용하는 클래스 ActionExam 
public class ActionExam {
	public static void main(String args[]) {
		Action action = new MyAction();
		action.exec();
	}
}