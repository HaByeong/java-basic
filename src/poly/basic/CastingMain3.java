package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Child child = new Child(); //x001
        Parent parent1 = (Parent) child; //업캐스팅은 () 생략 가능, 생략 권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
