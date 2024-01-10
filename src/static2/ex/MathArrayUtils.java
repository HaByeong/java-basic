package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //누군가가 객체 생성을 할 수 없도록 하기 위해!! 생성자를 private으로 만들자
    }
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        //이미 위에서 static 메서드로 합을 만듬 => sum 메서드 쓰자
        return (double) (sum(values) / values.length);
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }
        public static int max(int[] values) {
        int maxValue = values[0];
        for (int num : values) {
            if (maxValue < num) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}
