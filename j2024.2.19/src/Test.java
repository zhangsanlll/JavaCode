import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-19
 * Time: 15:42
 */
public class Test {
    //用户登录小程序，程序启动提示用户输入用户名密码，
    // 如果错误使用自定义异常处理
    private  String userName = "lulilin";
    private  String passWord = "12345678";

    public void login(String name, String password) throws UserNameException, PassWordException {
            if (!this.userName.equals(name)) {
                throw new UserNameException("用户名错误！");
                //抛出异常
            }
            if (!this.passWord.equals(password)) {
                throw new PassWordException("密码错误！");
                //抛出异常
            }
            System.out.println("登录成功！");
    }


    public static void main(String[] args) {
        /*//需要两个变量用来存放用户名和密码的值
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String name = scan.nextLine();

        System.out.println("请输入密码：");
        String password = scan.nextLine();*/

        Test login = new Test();
        try {
            login.login("lulilin", "123456789");
        }catch (UserNameException e){
            e.printStackTrace();
        }catch (PassWordException e){
            e.printStackTrace();
        }

    }

}