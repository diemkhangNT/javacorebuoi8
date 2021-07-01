package vn.plusplus.activity82;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static java.lang.Math.toIntExact;

public class Comparisons {
    public static void main(String[] args) {
        // 1.
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long starttime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        long endtime = System.currentTimeMillis();

        // 2.
        long starttime1 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(arrayList.get(50000));
        }
        long endtime1 = System.currentTimeMillis();

        long starttime2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(linkedList.get(50000));
        }
        long endtime2 = System.currentTimeMillis();

        // 3.
        long starttime3 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            arrayList.remove(50000);
        }
        long endtime3 = System.currentTimeMillis();

        long starttime4 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            linkedList.remove(50000);
        }
        long endtime4 = System.currentTimeMillis();
        System.out.println("1. Thời gian thêm phần tử:");
        System.out.println("\tThời gian bắt đầu: "+ starttime);
        System.out.println("\tThời gian kết thúc: "+ endtime);
        System.out.println("\tTổng thời gian: "+(endtime-starttime)+"/ms");
        System.out.println("2. Thời gian lấy ra phần tử ở giữa:");
        System.out.println("\tArrayList: ");
        System.out.println("\t\tThời gian bắt đầu: "+ starttime1);
        System.out.println("\t\tThời gian kết thúc: "+ endtime1);
        System.out.println("\t\tTổng thời gian của ArrayList: "+(endtime1-starttime1)+"/ms");
        System.out.println("\tLinkedList: ");
        System.out.println("\t\tThời gian bắt đầu: "+ starttime2);
        System.out.println("\t\tThời gian kết thúc: "+ endtime2);
        System.out.println("\t\tTổng thời gian của LinkedList: "+(endtime2-starttime2)+"/ms");
        System.out.println("2. Thời gian xóa phần tử ở giữa: ");
        System.out.println("\tArrayList: ");
        System.out.println("\t\tThời gian bắt đầu: "+ starttime3);
        System.out.println("\t\tThời gian kết thúc: "+ endtime3);
        System.out.println("\t\tTổng thời gian của ArrayList: "+(endtime3-starttime3)+"/ms");
        System.out.println("\tLinkedList: ");
        System.out.println("\t\tThời gian bắt đầu: "+ starttime4);
        System.out.println("\t\tThời gian kết thúc: "+ endtime4);
        System.out.println("\t\tTổng thời gian của LinkedList: "+(endtime4-starttime4)+"/ms");
    }
}
