package vn.plusplus.activity81;

public class Journal extends Document{
    private int issueNumber;
    private int monthIssue;

    public Journal(){}

    public Journal(int issueNumber, int monthIssue) {
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public Journal(String id, String publisher, int number, int issueNumber, int monthIssue) {
        super(id, publisher, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Journal {" +
                " Số phát hành: " + issueNumber +
                ", Tháng phát hành: " + monthIssue +
                '}';
    }
}
