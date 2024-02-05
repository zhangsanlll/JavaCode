package operation;

import Book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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

    }
}
