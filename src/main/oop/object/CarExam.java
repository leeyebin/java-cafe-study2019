package main.oop.object;

public class CarExam {
	public static void main(String args[]) {

		Car c1 = new Car("�ҹ���"); //�����ڿ� ���� ����
		Car c2 = new Car("������");
		
		
		//Car c3 = new Car(); // ������ ������ �߻��մϴ�.

		System.out.println(c1.name);
		c1.start(); //start�޼ҵ带 ����
		
		System.out.println(c2.name);
		c2.start();
	}

}
