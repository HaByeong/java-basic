package poly.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String string) {
        System.out.println("SMS를 발송합니다: " + string);
    }
}
