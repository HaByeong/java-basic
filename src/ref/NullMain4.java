package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조값을 주면 해결 가능
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);
        
        //NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
