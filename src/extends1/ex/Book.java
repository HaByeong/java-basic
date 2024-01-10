package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        // System.out.println("이름:" + name + ", 가격:" + price); -> super.print() 이렇게 사용하면
        // 부모 클래스의 메서드를 사용할 수 있다...!! => 그러면 부모 클래스의 멤벼 변수가 private이라도 불러올 수 있음
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
