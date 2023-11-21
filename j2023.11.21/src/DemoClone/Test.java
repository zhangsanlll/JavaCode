package DemoClone;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 16:38
 */

class Student implements Cloneable{
    public String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }




}
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student("zhangsan");
        //不能这么写的原因是因为clone是一个方法，调用它需要有对象引用
       // Student s2 =(Student)clone();
        Student s2 =(Student)s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }


}
