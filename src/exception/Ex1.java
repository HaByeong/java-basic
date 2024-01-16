package exception;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(1);
        //예외가 발생하지 않았을 경우
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        } //try - catch의 끝
        System.out.println(5);
    }
}
