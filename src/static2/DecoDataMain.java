package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DacoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DacoData data1 = new DacoData();
        data1.instanceCall();

        DacoData.staticCall(data1);
    }
}
