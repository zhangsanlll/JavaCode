package Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 21:17
 */
class Animal {
    String name;
    int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    //重写的方法不能是static、final、privated 修饰的
    public void eat(){
        System.out.println(name+"吃饭！");
    }

}

 class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"正在吃鱼");
    }
}

 class TestAnimal {
    public static void eat(Animal animal){
        animal.eat();

    }

    public static void main(String[] args) {
        eat(new Dog("小狗",1));
    }
}
