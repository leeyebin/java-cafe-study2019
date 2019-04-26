package main.oop.getter_setter.classes;

public class Car {
	//필드
	private int speed; //private 이기 때문에 외부에서 직접 접근 불가
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {//set메소드에 검증코드를 넣는다.
		if(speed < 0) { //마이너스 값을 갖고있는 속도는 없기때문에 0으로 수정한다.
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
