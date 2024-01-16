package exception;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        //예외가 발생했을 경우
        try {
            System.out.println(3);
            System.out.println(args[0]); // 0으로 나누기 금지, ArithmeticException 예외 발생!!!
            System.out.println(4); //예외 발생 이후 문장은 실행이 되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        //} catch (ArrayIndexOutOfBoundsException e) {
        } catch (Exception e) { // 모든 예외의 최고 조상인 Exception 그리도 가능하면 에러 타입 같은 것을 사용하자
            System.out.println("ArrayIndexOutOfBoundsException");
        } //try-catch의 끝
        System.out.println(6);
    }
}
