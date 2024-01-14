package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        if (option.equals("kakao")) {
            KakaoPay pay = new KakaoPay();
            result = pay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay pay = new NaverPay();
            result = pay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다."); result = false;
        }
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
