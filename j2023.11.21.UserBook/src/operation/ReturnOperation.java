package operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:42
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的图书名字：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(false);
                return;
            }
        }
        System.out.println("没有你要归还的图书！");
    }
}
