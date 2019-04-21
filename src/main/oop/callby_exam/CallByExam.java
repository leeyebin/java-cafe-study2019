package main.oop.callby_exam;

import main.oop.callby_exam.claees.CallByClass;
import main.oop.callby_exam.claees.CallByReference;

public class CallByExam {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//CallByValue
		System.out.println("swap() 호출 전 : a = " + a + ", b = " + b);
	
		CallByClass.swapValue(a, b);
		
		System.out.println("swap() 호출 후 : a = " + a + ", b = " + b);
		System.out.println("#########################################");
		
		//CallByReference
		CallByReference a1 = new CallByReference(10);
		CallByReference b1 = new CallByReference(20);
		System.out.println("swap() 호출 전 : a = " + a1.value + ", b = " + b1.value);

		CallByClass.swapReference(a1, b1);
		
		System.out.println("swap() 호출 전 : a = " + a1.value + ", b = " + b1.value);
	}

}
