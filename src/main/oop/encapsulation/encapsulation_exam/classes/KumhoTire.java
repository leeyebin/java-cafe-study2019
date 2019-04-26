package main.oop.encapsulation.encapsulation_exam.classes;

public class KumhoTire extends Tire{
    public KumhoTire() {
        setName("금호타이어");  // setName이라는 메소드는 접근제한자가 protected이므로 하위클래스에서 호출 가능
    }

    public String name() {
        return name;    // name을 사용할 수 있는 이유는 name의 접근제한자가 default이기 때문. (타이어 클래스와 같은 패키지에 존재)
    }
}
