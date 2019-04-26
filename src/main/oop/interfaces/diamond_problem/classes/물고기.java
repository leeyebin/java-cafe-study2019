package main.oop.interfaces.diamond_problem.classes;


public interface 물고기 {
    default void 헤엄치기() {
        System.out.println("지느러미로 헤엄친다.");
    }
    
    static void 숨쉬기() {
    	System.out.println("아가미로 숨을 쉰다.");
    }
}