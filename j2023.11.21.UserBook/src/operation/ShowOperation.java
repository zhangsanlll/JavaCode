package operation;

import Book.Book;
import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-02-05
 * Time: 21:38
 */
public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("打印所有图书！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
                System.out.println(book);

            }
        return;
        }
    }

