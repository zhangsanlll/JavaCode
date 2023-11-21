package operation;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 20:54
 */

//操作规范
    //操作书架上的书
public interface IOperation {
    void work(BookList bookList) ;
}
