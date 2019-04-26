package main.oop.encapsulation.encapsulation_exam;

import main.oop.encapsulation.encapsulation_exam.classes.KumhoTire;
import main.oop.encapsulation.encapsulation_exam.classes.Tire;

public class Example1 {
    public static void main(String[] args) {
        Tire tire = new Tire();
        //tire.setName("타이어"); //외부에서 타이어클래스를 생성했기 때문에 setName 메소드 사용 불가

        KumhoTire kumhoTire = new KumhoTire();
        String name = kumhoTire.name();   // 이름 메소드는 접근제한자가 public이므로 외부에서 호출 가능.
        System.out.println(name);
    }
}
