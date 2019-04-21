package main.oop.callByExam.claees;

public class CallByClass {
	public static void swapValue(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void swapReference(CallByReference x, CallByReference y) {
		int temp = x.value;
		x.value = y.value;
		y.value = temp;
	}
}
