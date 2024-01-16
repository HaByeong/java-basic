package exception;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(1);
        //예외가 발생했을 경우
        try {
            System.out.println(0/0); // 0으로 나누기 금지 예외발생!!!
            System.out.println(2); //예외 발생 이후 문장은 실행이 되지 않는다.
        } catch (ArithmeticException ae) { //여기에선 ArithmeticException 예외 발생
            System.out.println(3);
        } //try - catch의 끝
        System.out.println(4);
    }
}
