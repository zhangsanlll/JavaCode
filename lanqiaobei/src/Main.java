/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-28
 * Time: 16:49
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int day = 0;
        int sum = 0;
        int money = 1;
        /*while(sum <= 108) {
            sum += money;
            money += 2;
            day++;
        }*/
        while(money <= 108) {
           // sum += money;
            money += 2;
            day++;
        }
        System.out.println(day);
    }

}
