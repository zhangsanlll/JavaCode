package DemoAnimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 23:03
 */
public class Cat extends Animal implements IRunning,ISwimming{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.name+"正在吃猫粮");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"在游泳");
    }

    @Override
    public void run() {
        System.out.println(this.name+"在跑步");
    }
}
