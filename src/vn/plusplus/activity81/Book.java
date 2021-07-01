package vn.plusplus.activity81;

public class Book extends Document{
    private String author;
    private int numberPage;

    public Book(){}

    public Book(String author, int numberPage) {
        this.author = author;
        this.numberPage = numberPage;
    }

    public Book(String id, String publisher, int number, String author, int numberPage) {
        super(id, publisher, number);
        this.author = author;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Book {" +
                " Tên tác giả: '" + author + '\'' +
                ", Số trang: " + numberPage +
                '}';
    }
}
