/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-07
 * Time: 18:30
 */
class Base1{
    public Base1(String s){
        System.out.print("B");
    }
}

public class Derived extends Base1{
    public Derived (String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}
