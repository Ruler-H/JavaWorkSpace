package Chapter_09;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        List <Student> array = new ArrayList<Student>();
        array.add(new Student("유재석", "파이썬"));
        array.add(new Student("박명수", "자바"));
        array.add(new Student("김종국", "자바"));
        array.add(new Student("조세호", "C"));
        array.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-------------------");
        for (Student student : array) {
            if (student.getCerti().equals("자바")) {
                System.out.println(student.getName());
            }
        }
    }
}

class Student{
    private String name;
    private String certi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCerti() {
        return certi;
    }

    public void setCerti(String certi) {
        this.certi = certi;
    }

    public Student(String name, String certi) {
        this.name = name;
        this.certi = certi;
    }
}
