package vn.plusplus.collectionCompare;

public class Student /*implements Comparable<Student>*/{
    private float gpa;
    private String name;

    public Student(float gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Student o) {
        if(this.gpa>o.gpa) return 1;
        else if(this.gpa<o.gpa) return -1;
        else return 0;
    }*/
}
