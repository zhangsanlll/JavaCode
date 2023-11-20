package DemoAnimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 23:07
 */
public class Test {
    public static void test1(Animal animal){
        animal.eat();
    }

    //也可以用接口接收
    public static void run(IRunning running){
        running.run();
    }

    public static void swim(ISwimming swimming){
        swimming.swim();
    }

    public static void fly(IFlying flying){
        flying.fly();
    }

    public static void main(String[] args) {
        test1(new Cat("咪咪"));
        run(new Cat("咪咪"));
        swim(new Cat("咪咪"));
       // fly(new Cat("咪咪"));
    }

}
