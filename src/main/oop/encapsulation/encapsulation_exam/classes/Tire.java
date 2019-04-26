package main.oop.encapsulation.encapsulation_exam.classes;

public class Tire {
    String name;//접근제한자가 생략되어있으므로 default

    protected void setName(String name) {//이 클래스를 상속받은 클래스는 protected이기때문에 메소드 사용 가능
        this.name = name;
    }
}
