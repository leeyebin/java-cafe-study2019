package main.oop.interfaces.diamond_problem.classes;


public class 인어 implements 사람, 물고기{
    @Override
    public void 헤엄치기() {
        사람.super.헤엄치기();//다중 상속 시 명확한 메소드 호출을 위해 상위 인터페이스의 메소드 명시
    }
}