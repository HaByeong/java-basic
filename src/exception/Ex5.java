package exception;

public class Ex5 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e; //예외 발생
            //throw new Exception("고의로 발생시켰음"); 이렇게 줄여 쓸 수 있다.
        } catch (Exception e) {
            System.out.println("에러 메시디 : " + e.getMessage());
            e.printStackTrace();;
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
