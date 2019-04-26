package main.oop.interfaces.diamond_problem;

import main.oop.interfaces.diamond_problem.classes.물고기;
import main.oop.interfaces.diamond_problem.classes.사람;
import main.oop.interfaces.diamond_problem.classes.인어;

public class Example3 {
	public static void main(String[] args) {
		인어 mermaid = new 인어();
		mermaid.헤엄치기();//디폴트 메소드 사용
		
		물고기.숨쉬기();//static 메소드 사용
		사람.숨쉬기();
	}
}