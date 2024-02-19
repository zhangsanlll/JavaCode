package operation;

import Book.Book;
import Book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:40
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书名字：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    System.out.println("该书已经被借出！");
                }else {
                    book.setBorrowed(true);

                }
                return;
            }
        }
        System.out.println("没有你要借阅的图书!");
    }
}
