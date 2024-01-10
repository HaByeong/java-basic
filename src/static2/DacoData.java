package static2;

public class DacoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근 -> 에러
        //instanceMethod(); // 인스턴스 메서드 접근 -> 에러

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public static void staticCall(DacoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++; //DacoData.staticValue 와 같다
        staticMethod();
    }
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
