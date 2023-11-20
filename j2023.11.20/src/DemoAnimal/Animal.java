package DemoAnimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 22:59
 */
abstract public class Animal {
    protected String name;

    //构造方法只有修饰权限和类名，参数列表改变

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();//也可以不写，当作普通的父类

}
