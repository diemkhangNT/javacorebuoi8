package vn.plusplus.collectionCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students  = new ArrayList<>();
        students.add(new Student(5.5f,"A"));
        students.add(new Student(6.5f,"C"));
        students.add(new Student(1.5f,"K"));
        students.add(new Student(0.5f,"D"));
        // Cach 1: Implement interface trong Student
        /*System.out.println("Sap xep xuoi");
        Collections.sort(students);
        for(Student st : students){
            System.out.println(st);
        }
        System.out.println("Sap xep nguoc");
        Collections.reverse(students);
        for(Student st:students){
            System.out.println(st);
        }*/
        // Cach 2: Su dung Comparator tai vi tri can sap xep
        System.out.println("Sap xep xuoi theo diem");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa()>o2.getGpa()) return 1;
                else if(o1.getGpa()<o2.getGpa()) return -1;
                else return 0;
            }
        });
        for(Student st : students){
            System.out.println(st);
        }
        System.out.println("Sap xep nguoc theo diem");
        Collections.reverse(students);
        for(Student st:students){
            System.out.println(st);
        }
        System.out.println("Sap xep xuoi theo ten");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student st : students){
            System.out.println(st);
        }
        System.out.println("Sap xep nguoc theo ten");
        Collections.reverse(students);
        for(Student st:students){
            System.out.println(st);
        }
    }
}
