package operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 20:57
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入图书的名字：");
        String name = scan.nextLine();
        System.out.println("请输入图书作者：");
        String author = scan.nextLine();
        System.out.println("请输入图书的类型：");
        String type = scan.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scan.nextInt();

        Book books = new Book(name,author,price,type);

        int currentsize = bookList.getUsedSize();
        bookList.setBook(currentsize,books);

        bookList.setUsedSize(currentsize+1);

        System.out.println("新增图书成功！");

       // scan.close();
    }
}
