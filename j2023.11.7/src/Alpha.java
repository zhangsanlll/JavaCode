/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-07
 * Time: 18:28
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    class Base {
        Base() {
            System.out.print("Base");
        }
    }

    public class Alpha extends Base {

        public static void main( String[] args ) {
            new Alpha();//1
            //调用父类无参的构造方法
            new Base();//2
        }
    }
