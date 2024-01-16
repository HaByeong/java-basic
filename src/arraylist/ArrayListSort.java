package arraylist;

import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList<Integer> list1 = new ArrayList<>(10);
        // ArrayList에는 객체만 저장이 가능하다.
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5); // 실제로는 컴파일러가 list1.add(new Integer(5)); 로 바꿔줌
        list1.add(4); // 근데 나는 자바 버전이 높아서 제네릭 <> 이거 써줘서 해결
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1,4));

        System.out.println(list1);
        System.out.println(list2);

        //Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1); //list1과 list2를 정렬한다.
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
