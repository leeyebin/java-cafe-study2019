package main.oop.anonymous_exam.classes;

//인터페이스 Action을 상속받은 클래스 MyAction
public class MyAction implements Action {
	@Override
	public void exec() {
		System.out.println("exec");
	}
}