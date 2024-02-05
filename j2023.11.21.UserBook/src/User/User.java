package User;

import Book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-21
 * Time: 20:39
 */
public abstract class User {
    protected String name;

    public IOperation[] ioperation;//没有分配空间

    public User(String name){
        this.name = name;
    }

    public abstract  int menu();

    public void doOperationn(int choice, BookList bookList){
        this.ioperation[choice].work(bookList);
    }
}
