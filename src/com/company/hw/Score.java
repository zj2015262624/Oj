package com.company.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Score {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            final int  k = sc.nextInt();
            int m = 1;
            ArrayList<Student> list = new ArrayList<Student>();
            for(int i = 0;i < n;i++){
                list.add(new Student(sc.next(),sc.nextInt(),m++));
            }
            Collections.sort(list, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if(o1.score > o2.score ){
                        if(k == 0){
                            return -1;
                        }else{
                            return 1;
                        }
                    }else if(o1.score == o2.score ){
                        return o1.index < o2.index? -1:1;
                    }else{
                        if(k == 0){
                            return 1;
                        }else{
                            return -1;
                        }
                    }
                }
            });
            for (int i = 0; i < n; i++) {
                Student s = list.get(i);
                System.out.println(s.name + " " + s.score);
            }
        }

    }
    static class Student{
        String name;
        int score;
        int index;
        public Student(String name,int score,int index){
            this.name = name;
            this.score = score;
            this.index = index;
        }
    }
}
