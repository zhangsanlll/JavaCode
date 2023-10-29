/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-28
 * Time: 17:01
 */
import java.util.Scanner;
public class Test1 {

    private int x;
    private int y;

    private Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Test1 data = new Test1(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

}
