package main.oop.interfaces;

import main.oop.interfaces.classes.�����ִ�;
import main.oop.interfaces.classes.����;
import main.oop.interfaces.classes.����;

public class Example2 {
	/**
	 * �������̽� ����ü�� �ش� �������̽��� ��ȯ ����
	 */
	public static void main(String[] args) {
		�����ִ�[] animals = new �����ִ�[2];

		animals[0] = new ����();
		animals[1] = new ����();

		for (int i = 0; i < animals.length; i++) {
			animals[i].fly();
		}
	}
}