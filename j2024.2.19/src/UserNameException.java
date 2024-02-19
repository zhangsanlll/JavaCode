/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-19
 * Time: 15:56
 */

//用户名错误异常
public class UserNameException extends Exception{
    public UserNameException() {
        super();
    }

    public UserNameException(String message){
        super(message);
    }
}
