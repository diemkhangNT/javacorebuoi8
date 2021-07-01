package vn.plusplus.activity81;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DocumenntManagement {
    private List<Document> documents = new ArrayList<>();
    public DocumenntManagement(){
    }
    public DocumenntManagement(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    //1.2 Các chức năng:
    //- Thêm mới tài liệu: Sách, tạp chí, báo.
    Scanner input = new Scanner(System.in);
    List<String> tenTL = new ArrayList<String>();
    int k=0;
    public void addDocument() {

        System.out.print("Enter Document type (book/journal/newspaper): ");
        String type = input.nextLine();
        System.out.print("Enter ID: ");
        String id = input.nextLine();
        System.out.print("Enter Publisher: ");
        String publish = input.nextLine();
        System.out.print("Enter number of releases: ");
        int num = input.nextInt();
        input.nextLine();
        Loop:
        {
            switch (type) {
                case "book":
                    tenTL.add("book");
                    k++;
                    Book book = new Book();
                    System.out.print("Enter Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter number page: ");
                    int numpage = input.nextInt();
                    input.nextLine();
                    book.setId(id);
                    book.setPublisher(publish);
                    book.setNumber(num);
                    book.setAuthor(author);
                    book.setNumberPage(numpage);
                    documents.add(book);
                    break;
                case "journal":
                    tenTL.add("journal");
                    k++;
                    Journal journal = new Journal();
                    System.out.print("Enter issue number: ");
                    int issuenumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter month issue: ");
                    int monthissue = input.nextInt();
                    input.nextLine();
                    journal.setId(id);
                    journal.setPublisher(publish);
                    journal.setNumber(num);
                    journal.setIssueNumber(issuenumber);
                    journal.setMonthIssue(monthissue);
                    documents.add(journal);
                    break;
                case "newspaper":
                    tenTL.add("newspaper");
                    k++;
                    Newspaper newspaper = new Newspaper();
                    System.out.print("Enter day issue: ");
                    int dayissue = input.nextInt();
                    input.nextLine();
                    newspaper.setId(id);
                    newspaper.setPublisher(publish);
                    newspaper.setNumber(num);
                    newspaper.setDayIssue(dayissue);
                    documents.add(newspaper);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            System.out.print("Do you want add document? (Y/N): ");
            String choose = input.nextLine();
            if (choose.toUpperCase().equals("Y")) addDocument();
            else break Loop;
        }
    }


    //- Hiển thị thông tin về tài liệu.
    public void output(){
        for (int i=0;i<documents.size();i++) {
            System.out.println("- Tài liệu thứ "+(i+1));
            System.out.println("\tMã tài liệu:      "+documents.get(i).getId());
            System.out.println("\tTên nhà xuất bản: "+documents.get(i).getPublisher());
            System.out.println("\tSố bản phát hành: "+documents.get(i).getNumber());
            System.out.println("\tLoại tài liệu:    "+documents.get(i).toString());
        }
    }
    //- Xoá tài liệu theo mã tài liệu.
    public void removeDocument(){
        System.out.println("Nhập chính xác Mã tài liệu của tài liệu mà bạn muốn xóa: ");
        String removeId = input.nextLine();
        for (int i=0;i<documents.size();i++){
            if(documents.get(i).getId().equals(removeId)){
                documents.remove(i);
                tenTL.remove(i);
            }
        }
        System.out.println("Những tài liệu còn lại:");
        output();
    }
    //- Tìm kiếm tài liệu theo thể loại: Sách, tạp chí, báo.
    public void findDocument(){
        System.out.print("Nhập vào loại tài liệu mà bạn muốn tìm (book/journal/newspaper): ");
        String typeTL = input.nextLine();
        int j=0;
        for(int i=0;i<documents.size();i++){
            if(typeTL.equals(tenTL.get(i))){
                System.out.println("\tTài liệu "+(i+1)+": "+documents.get(i).toString());
                System.out.println("\t\tMã tài liệu:      "+documents.get(i).getId());
                System.out.println("\t\tTên nhà xuất bản: "+documents.get(i).getPublisher());
                System.out.println("\t\tSố bản phát hành: "+documents.get(i).getNumber());
                System.out.println();
            }else j++;
        }
        if(j==documents.size()){
            System.out.println("Không có tài liệu mà bạn tìm! ");
        }
    }
    //- Thoát khỏi chương trình
    public void Exit(){
        System.out.println("Tạm biệt!");
        System.exit(0);
    }

}
