package operation;

import Book.BookList;

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

    }
}
