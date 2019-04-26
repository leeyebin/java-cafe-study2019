package main.oop.inheritance;

import main.oop.inheritance.classes.고래;
import main.oop.inheritance.classes.동물;
import main.oop.inheritance.classes.박쥐;
import main.oop.inheritance.classes.조류;
import main.oop.inheritance.classes.참새;
import main.oop.inheritance.classes.펭귄;
import main.oop.inheritance.classes.포유류;

public class InheritanceExam2 {
	public static void main(String args[]) {
		//하위 클래스는 상위 클래스로 변환(대체) 가능
		
		동물[] animals = new 동물[4];

        animals[0] = new 동물();
        animals[1] = new 포유류();
        animals[2] = new 고래();
        animals[3] = new 박쥐();

        for(int i = 0; i < animals.length; i++) {
            animals[i].showMe();
        }
	}
}