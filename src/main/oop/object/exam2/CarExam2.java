package main.oop.object.exam2;

public class CarExam2 {
	public static void main(String args[]) {

		Car2 c1 = new Car2("소방차"); //생성자에 인자 전달
		Car2 c2 = new Car2("구급차");
		//Car c3 = new Car(); // 컴파일 오류가 발생, 컴파일이 되게 하려면, 
							//추가로 매개변수가 없는 생성자를 선언해야함

		System.out.println(c1.name);
		c1.start(); //start메소드를 실행
		
		System.out.println(c2.name);
		c2.start();
	}

}
