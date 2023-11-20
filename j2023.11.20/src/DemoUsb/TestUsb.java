package DemoUsb;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 22:27
 */
public class TestUsb {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useDevice(new KeyBoard());
        System.out.println("============");
        computer.useDevice((new Mouse()));
    }
}
