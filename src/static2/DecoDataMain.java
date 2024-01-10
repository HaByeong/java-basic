package static2;

//import static static2.DacoData.staticCall;
public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DacoData.staticCall();
        DacoData.staticCall();
        DacoData.staticCall();
        DacoData.staticCall();
        DacoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DacoData data1 = new DacoData();
        data1.instanceCall();

        DacoData.staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        DacoData data3 = new DacoData();
        data3.staticCall();

        //클래스 통한 접근
        DacoData.staticCall();
    }
}
