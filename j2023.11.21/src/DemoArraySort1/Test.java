package DemoArraySort1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 15:14
 */

class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student student) {
        if(this.score -student.score >0){
            return 1;
        } else if (this.score -student.score == 0) {
            return 0;
        }else{
            return -1;
        }
    }


}
public class Test {

    public static void main(String[] args) {
        Student[] array = new Student[2];
        array[0] = new Student("张三",99,12);
        array[1] = new Student("李四",49,25);
        System.out.println("排序前："+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("排序后："+Arrays.toString(array));

    }
    public static void main1(String[] args) {

        Student s1=new Student("张三",88,12);
        Student s2=new Student("李四",99,25);
        //Arrays.sort(array);
        int ret = s1.compareTo(s2);
        if(ret<0){
            System.out.println(ret);
        }

    }
}
