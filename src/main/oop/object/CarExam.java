package main.oop.object;

public class CarExam {
	public static void main(String args[]) {

		Car c1 = new Car("소방차"); //생성자에 인자 전달
		Car c2 = new Car("구급차");
		
		
		//Car c3 = new Car(); // 컴파일 오류가 발생합니다.

		System.out.println(c1.name);
		c1.start(); //start메소드를 실행
		
		System.out.println(c2.name);
		c2.start();
	}

}
