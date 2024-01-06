package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit() { //이게 이제 기본 생성자
    }
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
