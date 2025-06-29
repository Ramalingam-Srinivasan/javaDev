package dsa;

import java.util.*;
import java.util.function.Function;

public class CollectionDemo {

    public static void main(String[] args) {

       // Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();
        nums.add(11);
        nums.add(10);
        nums.add(10);
        nums.add(21);
        nums.add(13);
        nums.add(31);

        Iterator<Integer> iterator = nums.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();
          //  System.out.println(next);
        }

        List<Integer> numslist = new ArrayList<>();
        numslist.add(52);
        numslist.add(65);
        numslist.add(31);
        numslist.add(43);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(numslist,com);

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(32,"ram"));
        stud.add(new Student(30,"tinku"));
        stud.add(new Student(26,"priya"));
        stud.add(new Student(32,"vino"));


        Comparator<Student> com1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.id > o2.id)
                    return 1;
                else
                    return -1;
            }
        };

       // Collections.sort(stud,com1);
        Collections.sort(stud);
        System.out.println(stud);
    }

}

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student that) {
        return this.id>that.id ? 1 : -1;
    }
}