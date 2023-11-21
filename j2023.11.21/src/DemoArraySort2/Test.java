package DemoArraySort2;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 15:56
 */

class Student {
    public String name;
    public int score;
    public  int age;

    public Student(String name, int score,int age){
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
    //相当于是一个AgeComparator类，有一个接口叫Comparator
     class AgeComparator implements Comparator<Student>{

        @Override
        public int compare(Student student, Student t1) {
            return student.score- t1.score;
        }
    }




public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张三",88,12);
        Student s2=new Student("李四",99,25);



        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(s1,s2);
        System.out.println(ret);
    }



}
