package operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:33
 */
public class FindOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的图书姓名：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("找到这本书了！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要查找的这本书！");
    }
}
