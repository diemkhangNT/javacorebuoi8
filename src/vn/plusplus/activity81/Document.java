package vn.plusplus.activity81;

public class Document {
    private String id;
    private String publisher;
    private int number;
    public Document(){}
    public Document(String id, String publisher, int number) {
        this.id = id;
        this.publisher = publisher;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
