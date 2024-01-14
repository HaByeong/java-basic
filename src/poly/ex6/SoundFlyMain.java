package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(chicken);
        soundAnimal(bird);

        flyAnimal(chicken);
        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("동물 날기 테스트 시작");
        fly.fly();
        System.out.println("동물 날기 테스트 종료");
    }
}
