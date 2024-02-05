package User;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 20:40
 */
public class Normal extends User{

    public Normal(String name) {
        super(name);
        this.ioperation = new IOperation[]{
                //按下标
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };//动态初始化
    }

    public int menu(){
        System.out.println("普通用户的菜单！");
        System.out.println("********************");
        System.out.println("Hello "+this.name+",欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");

        System.out.println("3.归还图书");
        System.out.println("0.退出系统！");
        System.out.println("********************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;

    }
}
