import Book.BookList;
import User.Administrator;
import User.Normal;
import User.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:53
 */
public class Main {
    //登录

    //向上转型
   public static User login(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入你的姓名：");
       String name = scanner.nextLine();

       System.out.println("请输入你的身份：1 or 0");;
       int choice = scanner.nextInt();
       if(choice == 1){
           return new Administrator(name);
       }else{
           return new Normal(name);

       }
   }
    public static void main(String[] args) {

        BookList bookList = new BookList();
       //user最终指向哪个用户
       User user =  login();
        while(true) {
            int choice = user.menu();
            //根据这个choice决定调用指定的操作
            user.doOperationn(choice, bookList);//the most important
        }
    }
}
