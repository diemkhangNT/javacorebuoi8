package vn.plusplus.activity81;

public class Newspaper extends Document{
    private int dayIssue;

    public Newspaper(){}

    public Newspaper(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    public Newspaper(String id, String publisher, int number, int dayIssue) {
        super(id, publisher, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper {" +
                " Ngày phát hành: " + dayIssue +
                '}';
    }
}
